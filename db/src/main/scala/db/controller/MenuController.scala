package db.controller

import db.service.MenuRepositoryService
import org.http4s.dsl.Http4sDsl
import org.http4s.implicits.*
import org.http4s.dsl.io._
import org.http4s.circe._
import org.http4s.HttpRoutes
import cats.effect.IO

class MenuController(menuRepositoryService: MenuRepositoryService) {

  val menuRoutes: HttpRoutes[IO] = HttpRoutes.of {
    case req @ GET -> Root / "api" / "v1" / "menu" / UUIDVar(id) ⇒
      Ok(menuRepositoryService.findMenu(id))
  }

}
