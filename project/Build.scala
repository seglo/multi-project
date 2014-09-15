import sbt._
import Keys._

object MyBuild extends Build {
  import Dependencies._

  val NamePrefix = "MyProject-"

  lazy val api = project.settings(Common.settings: _*).settings(libraryDependencies ++= apiDependencies)

  lazy val client = project.dependsOn(api).settings(Common.settings: _*).settings(libraryDependencies ++= clientDependencies)

  lazy val server = project.dependsOn(api).settings(Common.settings: _*).settings(libraryDependencies ++= serverDependencies)

  lazy val root = (project in file(".")).aggregate(api, client, server)
}