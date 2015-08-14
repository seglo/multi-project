import sbt._
import Keys._

object Dependencies {
  //val scalaTest = "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
  val scalaTest = "org.scalatest" %% "scalatest" % "2.1.7" % "test"

  val slf4jVersion = "1.6.4"
  val slf4jNop = "org.slf4j" % "slf4j-nop" % slf4jVersion

  val commonDependencies: Seq[ModuleID] = Seq(
    scalaTest,
    slf4jNop
  )

  
  val apiDependencies    : Seq[ModuleID] = Seq() ++ commonDependencies
  val serverDependencies : Seq[ModuleID] = Seq() ++ commonDependencies
  val clientDependencies : Seq[ModuleID] = Seq() ++ commonDependencies
}