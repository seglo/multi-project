package domain

object DomainEcho extends api.Echo {
	
	override def echo(s : String) = s"service: $s"
}