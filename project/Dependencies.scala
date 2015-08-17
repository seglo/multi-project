import sbt._
import Keys._

object Dependencies {

  val slf4jVersion = "1.6.4"
  val slf4jNop = "org.slf4j" % "slf4j-nop" % slf4jVersion

  val commonDependencies: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % "2.2.4" % "test",
    slf4jNop,
    "org.threeten" % "threetenbp" % "1.3",
    "junit" % "junit" % "4.12" % "test"
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
    "com.sksamuel.elastic4s" %% "elastic4s-core" %  "1.7.0",
    "com.sksamuel.elastic4s" %% "elastic4s-testkit" % "1.7.0" % "test"
  )
  val sparkDependencies  : Seq[ModuleID] = commonDependencies ++ Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion,
    "org.apache.spark" %% "spark-mllib" % sparkVersion,
    "org.apache.spark" %% "spark-streaming" % sparkVersion)
  val webDependencies    : Seq[ModuleID] = commonDependencies ++ json ++ {
    Seq(
      //jdbc,
      //cache,
      // ws
      //specs2 % Test
    )

  }
}