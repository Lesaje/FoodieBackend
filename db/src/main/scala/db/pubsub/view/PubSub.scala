package db.pubsub.view

import cats.effect.IO
import lepus.client.Connection

trait PubSub {
  def subscriber(con: Connection[IO]): Unit
  def publisher(con: Connection[IO]): Unit
  def run(con: Connection[IO]): IO[Unit]
}
