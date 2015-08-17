package search

import com.sksamuel.elastic4s.ElasticDsl
import com.sksamuel.elastic4s.ElasticDsl._
import com.sksamuel.elastic4s.testkit.ElasticSugar
import org.elasticsearch.action.index.IndexResponse
import org.junit.runner.RunWith
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.junit.JUnitRunner
import org.scalatest.time.{Millis, Seconds, Span}
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class SearchMainTest extends WordSpec with ElasticSugar with ScalaFutures with Matchers {

  "Search.index" should {
    "index and get stuff" in {
      val query = ElasticDsl.index into "foo" / "bar" fields ("hello" -> "world")
      val indexResult: IndexResponse = client.execute(query).futureValue
      indexResult.isCreated should be(true)

      val readBack = client.execute(ElasticDsl.get(indexResult.getId) from "foo" / "bar").futureValue
      readBack.getSourceAsMap.get("hello") should be("world")

    }
  }

  implicit override val patienceConfig = PatienceConfig(timeout = scaled(Span(2, Seconds)), interval = scaled(Span(150, Millis)))
}
