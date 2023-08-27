package db.service

import cats.effect.IO
import java.util.UUID
import db.model.Menu

class MenuRepositoryService {

  def findMenu(menuId: UUID): IO[Menu] = ???

}
