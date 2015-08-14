package client

import api._

object ClientMain {	
	def main(a : Array[String]) {
		val e = newEcho
		a.map(e.echo).foreach(println)
	}

	def newEcho = new Echo {
	     override def echo(s : String) = "client:" + s
	}
}