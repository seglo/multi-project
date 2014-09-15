object ServiceEcho extends Echo {
	
	override def echo(s : String) = s"service: $s"
}