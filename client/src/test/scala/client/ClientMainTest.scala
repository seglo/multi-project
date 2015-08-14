package client

import org.scalatest._

class ClientMainTest extends FunSpec {
	describe("ClientMain.newEcho") {
		it("should create a new echo") {
			assert(ClientMain.newEcho.echo("hi") === "client:hi")
		}
	}
}