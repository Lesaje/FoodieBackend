package db.model

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


  private enum PaymentType:
    case Card extends PaymentType
    case Cash extends PaymentType

  private enum Status:
    case Created extends Status
    case InProgress extends Status
    case Ready extends Status
    case Completed extends Status

}
