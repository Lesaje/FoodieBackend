package db.model

case class Address(city: String,
                   district: Option[String],
                   street: String,
                   address: Int)
