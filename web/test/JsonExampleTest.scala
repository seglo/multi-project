
import java.util.UUID

import argonaut.CodecJson
import domain.{Address, Business, Employee, TestData}
import org.junit.runner._
import org.scalatest.junit.JUnitRunner
import org.scalatest.{WordSpec, BeforeAndAfterAll, Matchers}

@RunWith(classOf[JUnitRunner])
class JsonExampleTest extends WordSpec with TestData with Matchers with BeforeAndAfterAll {


  "Business to/from json" should {
    "be easy with argonaut" in {

      import argonaut._, Argonaut._

      implicit def uuidCodecJson: CodecJson[UUID] = {
        def fromString(s : Option[String]) = s.map(UUID.fromString).getOrElse(???)
        def unapplyUUID(id : UUID) = Option(id.toString)
        codec1(fromString, unapplyUUID)("uuid")
      }

      implicit def addressCodecJson: CodecJson[Address] = {
        casecodec6(Address.apply, Address.unapply)("name", "street", "line1", "line2", "country", "zip-code")
      }

      implicit def employeeCodecJson: CodecJson[Employee] = {
        casecodec3(Employee.apply, Employee.unapply)("id", "name", "address")
      }

      implicit def businessJson: CodecJson[Business] = {
        casecodec4(Business.apply, Business.unapply)("id", "name", "employees", "address")
      }

      val json = businessJson.encode(someBusiness)

      println(json.pretty(PrettyParams.spaces2))

      val backAgainOpt: DecodeResult[Business] = businessJson.decodeJson(json)

      println(backAgainOpt)

    }
  }
}
