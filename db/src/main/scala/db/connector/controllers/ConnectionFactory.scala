package db.connector.controllers

import cats.effect.{IO, Resource}
import cats.implicits.none
import skunk.implicits._
import db.connector.model.DbConfig
import fs2.io.net.SocketOption
import skunk.{SSL, Session}
import skunk.util.Typer

import scala.concurrent.duration.Duration

class ConnectionFactory extends  db.connector.view.ConnectionFactory {
  def createConnection(dbConfig: DbConfig): Resource[IO, Resource[IO, Session[IO]]] = Session.pooled[IO](
    host = dbConfig.host,
    port = dbConfig.port,
    user = dbConfig.username,
    database = dbConfig.database,
    password = Option(dbConfig.password),
    max = dbConfig.poolSize,
    debug = dbConfig.debug,
    strategy = dbConfig.strategy,
    ssl = dbConfig.ssl,
    parameters = dbConfig.parameters,
    socketOptions = dbConfig.socketOptions,
    commandCache = dbConfig.commandCache,
    queryCache = dbConfig.queryCache,
    parseCache = dbConfig.parseCache,
    readTimeout = dbConfig.readTimeout
  )
}
