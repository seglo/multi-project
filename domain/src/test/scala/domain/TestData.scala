package domain

import java.util.UUID

trait TestData {

  lazy val someAddress = Address("Some address", "Somewhere", Some("Main St"), None, "UK", "AB1 2CD")
  lazy val someEmployee = Employee(UUID.randomUUID(), "Dave", someAddress)
  lazy val someBusiness = Business(UUID.randomUUID, "some business", Set(someEmployee), someAddress)

}
