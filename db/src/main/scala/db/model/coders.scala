package db.model

import db.model.Restaurant.RestaurantId
import db.model.Dish.DishId
import db.model.Image.ImageId
import io.circe.{Decoder, Encoder}

import java.util.UUID

object coders:

  given Encoder[RestaurantId] = Encoder[UUID].contramap(RestaurantId.apply)
  given Decoder[RestaurantId] = Decoder[UUID].map(RestaurantId.apply)

  given Encoder[DishId] = Encoder[UUID].contramap(DishId.apply)
  given Decoder[DishId] = Decoder[UUID].map(DishId.apply)

  given Encoder[ImageId] = Encoder[UUID].contramap(ImageId.apply)
  given Decoder[ImageId] = Decoder[UUID].map(ImageId.apply)
