package db.model

object Address:
  enum City:
    case Kharkiv, Kyiv, Lviv, Odessa, Dnipro

end Adress

case class Address(city: Address.City,
                   district: Option[String],
                   street: String,
                   address: Int)
