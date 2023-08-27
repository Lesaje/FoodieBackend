package db.connector.view

import cats.effect.{IO, Resource}
import db.model.*
import db.model.Manager.Manager
import db.model.Order.Order
import db.model.Restaurant.{Restaurant, RestaurantId}
import skunk.Session

trait DbRepository(session: Resource[IO, Session[IO]]) {

  def putOrders(orders: List[Order]): IO[Unit]

  def putManagers(orders: Manager): IO[Unit]

  def putRestaurant(orders: Restaurant): IO[Unit]

  def putMenu(menu: Menu): IO[Unit]

  def getRestaurants(): IO[List[Restaurant]]

  def getMenu(id: RestaurantId): IO[Menu]
}
