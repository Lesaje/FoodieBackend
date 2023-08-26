package db.pubsub.model

import db.model.Restaurant.RestaurantId

case class GetRestaurants(city: String)

case class GetMenuFromRestaurant(id: RestaurantId)
