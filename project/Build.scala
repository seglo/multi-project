import sbt._
import Keys._

object MyBuild extends Build {
  val NamePrefix = "MyProject-"

  println(new java.io.File(".").getAbsolutePath)
}