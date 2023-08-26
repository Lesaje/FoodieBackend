package db.pubsub.controllers

import cats.effect.IO
import db.pubsub.view.PubSub
import lepus.client.Connection

object PubSub extends PubSub{
  def subscriber(con: Connection[IO]): Unit = ???

  def publisher(con: Connection[IO]): Unit = ???

  def run(con: Connection[IO]): IO[Unit] = ???
}
