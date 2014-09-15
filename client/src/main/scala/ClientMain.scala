object ClientMain {	
	def main(a : Array[String]) {
	  val echo : Echo = new Echo {
	     override def echo(s : String) = "client:" + s
	  }
	}
}