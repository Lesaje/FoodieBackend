package db.service

import cats.effect.IO
import db.model.Restaurant
import db.model.Address.City

class RestaurantRepositoryService {

  def findRestaurants(city: City): IO[List[Restaurant]] = ???

}
