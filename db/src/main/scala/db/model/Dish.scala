package db.model

import java.util.UUID

object Dish:

  opaque type DishId <: UUID = UUID

  object DishId:
    def apply(dishId: UUID): DishId = dishId

end Dish

case class Dish(dishId: Dish.DishId,
                name: String,
                ingredients: List[String],
                description: Option[String],
                weight: Int)

