package db.model

object Address:
  enum City:
    case Kharkiv, Kyiv, Lviv, Odessa, Dnipro

end Address

case class Address(city: Address.City,
                   district: Option[String],
                   street: String,
                   address: Int)
