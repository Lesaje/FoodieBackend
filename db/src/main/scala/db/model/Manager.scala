package db.model

import java.time.LocalDate
import java.util.UUID

opaque type ManagerId = UUID

object ManagerId:
  def apply(managerId: UUID): ManagerId = managerId

case class Manager(name: Name,
                   restaurantId: UUID,
                   employedAt: LocalDate)
