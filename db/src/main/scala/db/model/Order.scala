package db.model

import db.model.Dish.Dish
import db.model.Manager.ManagerId
import db.model.Restaurant.RestaurantId

import java.time.LocalTime
import java.util.UUID

object Order {

  opaque type OrderId = UUID

  object OrderId:
    def apply(orderId: UUID): OrderId = orderId

  case class Order(orderId: OrderId,
                   restaurantId: RestaurantId,
                   option: Option[ManagerId],
                   dishes: List[Dish],
                   createdAt: LocalTime,
                   updatedAt: LocalTime,
                   status: Status,
                   paymentType: PaymentType)


  enum PaymentType:
    case Card extends PaymentType
    case Cash extends PaymentType

  enum Status:
    case Created extends Status
    case InProgress extends Status
    case Ready extends Status
    case Completed extends Status

}
