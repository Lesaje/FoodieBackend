package db.model

import db.model.Dish.Dish
import db.model.Image.ImageId
import db.model.Restaurant.RestaurantId

case class Menu(restaurantId: RestaurantId, menuItems: List[MenuItem])

private case class MenuItem(dish: Dish, availability: Boolean, imageId: ImageId)
