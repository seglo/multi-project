package domain

import org.scalatest._
import api._

class DomainEchoTest extends FunSpec {
	describe("DomainEcho.echo") {
		it("should echo with a 'serivce' prefix") {
			assert(DomainEcho.echo("hi") === "service: hi")
		}
	}
}