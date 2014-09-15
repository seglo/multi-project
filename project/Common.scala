import sbt._
import Keys._

object Common {
  val appVersion = "0.0.1"

  val settings: Seq[Def.Setting[_]] = Seq(
    version := appVersion,
    resolvers += Opts.resolver.mavenLocalFile
  )
}