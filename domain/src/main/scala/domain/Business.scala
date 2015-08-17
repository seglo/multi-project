package domain

import java.util.UUID

case class Business(id : UUID, name : String, employees : Set[Employee], address : Address)
