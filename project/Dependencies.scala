import sbt._
import Keys._

object Dependencies {
  //val scalaTest = "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
  val scalaTest = "org.scalatest" %% "scalatest" % "2.2.4" % "test"

  val slf4jVersion = "1.6.4"
  val slf4jNop = "org.slf4j" % "slf4j-nop" % slf4jVersion

  val commonDependencies: Seq[ModuleID] = Seq(
    scalaTest,
    slf4jNop
  )

  
  val json : Seq[ModuleID] = Seq(
      "io.argonaut" %% "argonaut" % "6.1-M4" changing(),
      "com.propensive" %% "rapture-json-argonaut" % "1.1.0",
      "com.typesafe.play" %% "play-json" % "3.0")

  val apiDependencies    : Seq[ModuleID] = commonDependencies
  val serverDependencies : Seq[ModuleID] = commonDependencies
  val clientDependencies : Seq[ModuleID] = commonDependencies
  val webDependencies    : Seq[ModuleID] = commonDependencies ++ json ++ {
    Seq(
      //jdbc,
      //cache,
      // ws
      //specs2 % Test
    )

  }
}