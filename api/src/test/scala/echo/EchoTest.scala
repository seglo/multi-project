package api

import org.scalatest._

class EchoTest extends FunSpec {
	describe("Echo.echo") {
		it("should return some string for an input string") {
			object Rev extends Echo {
				override def echo(s : String) = s.reverse
			}
			assert("dlrow olleh" === Rev.echo("hello world"))
		}
	}
}