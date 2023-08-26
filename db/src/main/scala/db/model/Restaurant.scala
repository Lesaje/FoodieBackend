package db.model

import java.util.UUID

object Restaurant {

  opaque type RestaurantId = UUID

  object RestaurantId:
    def apply(restaurantId: UUID): RestaurantId = restaurantId

  case class Restaurant(id: RestaurantId,
                        name: String,
                        address: Address)
}
