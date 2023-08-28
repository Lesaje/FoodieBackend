package db.model

import java.time.LocalDate
import java.util.UUID

object Manager:

  opaque type ManagerId <: UUID = UUID

  object ManagerId:
    def apply(managerId: UUID): ManagerId = managerId

  opaque type PhoneNumber = String

  object PhoneNumber:
    def apply(phoneNumber: String): PhoneNumber = phoneNumber

end Manager

case class Manager(managerId: Manager.ManagerId,
                   name: Name,
                   phoneNumber: Manager.PhoneNumber,
                   restaurantId: Restaurant.RestaurantId,
                   employedAt: LocalDate)
