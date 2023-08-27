package db.connector.view

import cats.effect.{IO, Resource}
import cats.implicits.none
import db.connector.model.DbConfig
import fs2.io.net.SocketOption
import skunk.{SSL, Session}
import skunk.util.Typer

import scala.concurrent.duration
import scala.concurrent.duration.Duration

trait ConnectionFactory {
  def createConnection(dbConfig: DbConfig): Resource[IO, Resource[IO, Session[IO]]]
}
