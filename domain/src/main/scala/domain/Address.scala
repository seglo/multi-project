package domain

case class Address(name : String, street : String, line1 : Option[String], line2 : Option[String], country : String, zip : String)
