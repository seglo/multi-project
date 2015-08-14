package server

object ServiceEcho extends api.Echo {
	
	override def echo(s : String) = s"service: $s"
}