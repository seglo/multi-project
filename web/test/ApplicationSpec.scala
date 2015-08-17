
import org.junit.runner._
import org.scalatest.junit.JUnitRunner
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}
import play.api.test.Helpers._
import play.api.test._
import play.test.WithApplication

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
@RunWith(classOf[JUnitRunner])
class ApplicationSpec extends WithApplication with WordSpecLike with Matchers with BeforeAndAfterAll {

  override def beforeAll = {
    super.beforeAll()
    startPlay
  }

  override def afterAll = {
    super.afterAll()
    stopPlay
  }
  "Application" should {

    "send 404 on a bad request" in {
      val notFound = route(FakeRequest(GET, "/boum")).get
      status(notFound) should be (NOT_FOUND)
    }

    "render the index page" in new WithApplication{
      val home = route(FakeRequest(GET, "/")).get

      status(home) should be (OK)
      contentType(home).get should be("text/html")
      contentAsString(home) should include("Your new application is ready.")
    }
  }
}
