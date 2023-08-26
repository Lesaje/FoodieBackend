package db.model

case class Menu(restaurantId: RestaurantId, menuItems: List[MenuItem])

private case class MenuItem(dish: Dish, availability: Boolean, imageId: ImageId)
