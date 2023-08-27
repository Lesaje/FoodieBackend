package db.controller

import db.service.RestaurantRepositoryService
import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl
import org.http4s.implicits.*
import org.http4s.dsl.io.*
import org.http4s.HttpRoutes
import db.model.Address.City
import cats.effect.IO
import org.http4s.circe._

class RestaurantController(restaurantRepositoryService: RestaurantRepositoryService) {

  val restaurantRoutes: HttpRoutes[IO] = HttpRoutes.of {
    case req @ GET -> Root / "api" / "v1" / "restaurants" / city ⇒
      Ok(restaurantRepositoryService.findRestaurants(City.valueOf(city.substring(0, 1).toUpperCase + city.substring(1))))
  }


}
