import sbt._
import Keys._

object MyBuild extends Build {
  val NamePrefix = "MyProject-"

  println(new java.io.File(".").getAbsolutePath)

  lazy val api = project

  lazy val client = project.dependsOn(api)

  lazy val server = project.dependsOn(api)

  lazy val root = (project in file(".")).
    aggregate(api, client, server)
}