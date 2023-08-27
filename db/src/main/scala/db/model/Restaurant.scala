package db.model

import java.util.UUID

object Restaurant:

  opaque type RestaurantId <: UUID = UUID

  object RestaurantId:
    def apply(restaurantId: UUID): RestaurantId = restaurantId

end Restaurant

case class Restaurant(restaurantId: Restaurant.RestaurantId,
                      name: String,
                      address: Address)

