package db.model

import java.util.UUID

object Image:

  opaque type ImageId <: UUID = UUID

  object ImageId:
    def apply(imageId: UUID): ImageId = imageId

end Image

case class Image(imageId: Image.ImageId,
                 imageLink: String)