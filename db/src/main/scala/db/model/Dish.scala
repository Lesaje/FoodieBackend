package db.model

import java.util.UUID

opaque type DishId = UUID

object DishId:
  def apply(dishId: UUID): DishId = dishId

case class Dish(id: DishId,
                name: String,
                ingredients: List[String],
                description: Option[String],
                weight: Int)
