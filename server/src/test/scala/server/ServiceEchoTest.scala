package server

import org.scalatest._
import api._

class ServiceEchoTest extends FunSpec {
	describe("ServiceEcho.echo") {
		it("should echo with a 'serivce' prefix") {
			assert(ServiceEcho.echo("hi") === "service: hi")
		}
	}
}