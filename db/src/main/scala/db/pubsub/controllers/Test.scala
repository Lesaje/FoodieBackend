package db.pubsub.controllers

import cats.effect.*
import cats.syntax.all.*
import dev.hnaderi.namedcodec.*
import fs2.Stream
import fs2.Stream.*
import io.circe.generic.auto.*
import lepus.circe.given
import lepus.client.*
import lepus.protocol.domains.*
import lepus.std.*

import scala.concurrent.duration.*

object Test extends IOApp.Simple {

  private val protocol =
    TopicDefinition(
      ExchangeName("events"),
      ChannelCodec.default(CirceAdapter.of[Event]),
      TopicNameEncoder.of[Event]
    )

  def publisher(con: Connection[IO]) =
    for {
    ch                <- resource(con.channel)
    bus               <- eval(EventChannel.publisher(protocol, ch))
    (toPublish, idx)  <- Stream(
                                Event.Created("b"),
                                Event.Updated("a", 10),
                                Event.Updated("b", 100),
                                Event.Created("c")
                               ).zipWithIndex
    _                 <- eval(bus.publish(ShortString.from(idx), toPublish))
  } yield ()

  def consumer1(con: Connection[IO]): Stream[IO, String]=
    for {
      ch    <- resource(con.channel)
      bus   <- eval(EventChannel.consumer(protocol)(ch))
      evt   <- bus.events
      _     <- eval(IO.println(s"consumer 1: $evt"))
    } yield "{status: \"OK\"}"

  def consumer2(con: Connection[IO]): Stream[IO, Int] =
    for {
      ch    <- resource(con.channel)
      bus   <- eval(EventChannel.consumer(protocol, ch, TopicSelector("Created")))
      evt   <- bus.events
      _     <- eval(IO.println(s"consumer 2: $evt"))
    } yield 10

  override def run: IO[Unit] = LepusClient[IO]().use { con =>
    Stream(publisher(con), consumer1(con), consumer2(con)).parJoinUnbounded
      // This is needed in this example, in order to terminate application
      .interruptAfter(5.seconds)
      .compile
      .drain
  }
}

enum Event {
  case Created(id: String)
  case Updated(id: String, value: Int)
}

