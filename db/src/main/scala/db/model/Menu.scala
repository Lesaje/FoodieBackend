package db.model

import db.model.Dish
import db.model.Image
import db.model.Restaurant

case class Menu(restaurantId: Restaurant.RestaurantId, menuItems: List[MenuItem])

private case class MenuItem(dishId: Dish.DishId, availability: Boolean, imageId: Image.ImageId)
