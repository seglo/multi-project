import org.junit.runner._
import org.scalatest.{WordSpecLike, BeforeAndAfterAll, WordSpec, Matchers}
import org.scalatest.junit.JUnitRunner
import play.test.WithBrowser

/**
 * add your integration spec here.
 * An integration test will fire up a whole play application in a real (or headless) browser
 */
@RunWith(classOf[JUnitRunner])
class IntegrationSpec extends WithBrowser with WordSpecLike with Matchers with BeforeAndAfterAll {

  override def beforeAll = {
    super.beforeAll()
    startServer
    createBrowser
  }

  override def afterAll = {
    stopServer
    quitBrowser
  }

  "Application" should {

    "work from within a browser" in {

      browser.goTo("http://localhost:" + port)

      browser.pageSource should include("Your new application is ready.")
    }
  }
}
