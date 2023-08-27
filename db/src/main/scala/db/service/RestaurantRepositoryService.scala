package db.service

import db.model.Restaurant.City

class RestaurantRepositoryService {

  def findRestaurants(city: City): IO[List[Restaurant]] = ???

}
