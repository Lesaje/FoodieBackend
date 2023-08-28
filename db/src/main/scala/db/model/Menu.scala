package db.model

import db.model.Dish
import db.model.Image
import db.model.Restaurant
import io.circe.Codec
import db.model.coders.given

case class Menu(restaurantId: Restaurant.RestaurantId, menuItems: List[MenuItem]) derives Codec.AsObject

private case class MenuItem(dishId: Dish.DishId, availability: Boolean, imageId: Image.ImageId) derives Codec.AsObject

