package db.connector.model

import fs2.io.net.SocketOption
import skunk.{SSL, Session}
import skunk.util.Typer

import scala.concurrent.duration.Duration

case class DbConfig(host: String,
                    port: Int = 5432,
                    username: String,
                    database: String,
                    password: String, 
                    poolSize: Int,
                    debug: Boolean = false,
                    strategy: Typer.Strategy = Typer.Strategy.BuiltinsOnly,
                    ssl: SSL = SSL.None,
                    parameters: Map[String, String] = Session.DefaultConnectionParameters,
                    socketOptions: List[SocketOption] = Session.DefaultSocketOptions,
                    commandCache: Int = 1024,
                    queryCache: Int = 1024,
                    parseCache: Int = 1024,
                    readTimeout: Duration = Duration.Inf)
