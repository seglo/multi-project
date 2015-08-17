import sbt._
import Keys._

object Dependencies {
  //val scalaTest = "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
  val scalaTest = "org.scalatest" %% "scalatest" % "2.2.4" % "test"

  val slf4jVersion = "1.6.4"
  val slf4jNop = "org.slf4j" % "slf4j-nop" % slf4jVersion

  val commonDependencies: Seq[ModuleID] = Seq(
    scalaTest,
    slf4jNop,
    "org.threeten" % "threetenbp" % "1.3"
  )

  val sparkVersion = "1.4.1"
  
  val json : Seq[ModuleID] = Seq(
      "io.argonaut" %% "argonaut" % "6.0.4",
      "com.propensive" %% "rapture-json-argonaut" % "1.1.0",
      "com.typesafe.play" %% "play-json" % "2.4.2")

  val apiDependencies    : Seq[ModuleID] = commonDependencies
  val domainDependencies : Seq[ModuleID] = commonDependencies
  val clientDependencies : Seq[ModuleID] = commonDependencies
  val searchDependencies : Seq[ModuleID] = commonDependencies ++ Seq(
    "com.sksamuel.elastic4s" %% "elastic4s-core" %  "1.7.0")
  val sparkDependencies  : Seq[ModuleID] = commonDependencies ++ Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
    "commons-collections" % "commons-collections" % "3.2.1")
  val webDependencies    : Seq[ModuleID] = commonDependencies ++ json ++ {
    Seq(
      //jdbc,
      //cache,
      // ws
      //specs2 % Test
    )

  }
}