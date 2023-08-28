package db.connector.controllers

import cats.effect.{IO, Resource}
import db.model.*
import db.model.Manager
import db.model.Order
import db.model.Restaurant._
import skunk.Session

class DbRepository(session: Resource[IO, Session[IO]]) extends db.connector.view.DbRepository(session) {

  def putOrders(orders: List[Order]): IO[Unit] = ???

  def putManagers(orders: Manager): IO[Unit] = ???

  def putRestaurant(orders: Restaurant): IO[Unit] = ???

  def putMenu(menu: Menu): IO[Unit] = ???

  def getRestaurants(): IO[List[Restaurant]] = ???

  def getMenu(id: RestaurantId): IO[Menu] = ???
}
