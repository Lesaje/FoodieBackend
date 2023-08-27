package db.pubsub.controllers

import cats.effect.IO
import db.pubsub.view
import lepus.client.Connection

class PubSub extends view.PubSub {
  def subscriber(con: Connection[IO]): Unit = ???

  def publisher(con: Connection[IO]): Unit = ???

  def run(con: Connection[IO]): IO[Unit] = ???
}
