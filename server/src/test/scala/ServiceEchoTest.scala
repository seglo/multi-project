import org.scalatest._

class ServiceEchoTest extends FunSpec {
	describe("ServiceEcho.echo") {
		it("should echo with a 'serivce' prefix") {
			assert(ServiceEcho.echo("hi") === "service: hi")
		}
	}
}