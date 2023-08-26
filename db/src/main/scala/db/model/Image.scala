package db.model

import java.util.UUID

opaque type ImageId = UUID

object ImageId:
  def apply(imageId: UUID): ImageId = imageId

case class Image(imageId: UUID,
                imageLink: String)
