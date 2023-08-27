package db.model

import db.model.Dish
import db.model.Manager
import db.model.Restaurant

import java.time.{LocalTime, Instant}
import java.util.UUID

object Order:

  opaque type OrderId <: UUID = UUID

  object OrderId:
    def apply(orderId: UUID): OrderId = orderId

  enum PaymentType:
    case Card extends PaymentType
    case Cash extends PaymentType

  enum Status:
    case Created extends Status
    case InProgress extends Status
    case Ready extends Status
    case Completed extends Status

end Order

case class Order(orderId: Order.OrderId,
                 restaurantId: Restaurant.RestaurantId,
                 option: Option[Manager.ManagerId],
                 dishes: List[Dish.DishId],
                 createdAt: Instant,
                 updatedAt: Instant,
                 status: Order.Status,
                 paymentType: Order.PaymentType)

