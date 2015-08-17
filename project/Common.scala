import sbt._
import Keys._

object Common {
  val appVersion = "0.0.1"

  val settings: Seq[Def.Setting[_]] = Seq(
    version := appVersion,
    scalaVersion := "2.11.6",
    resolvers += Opts.resolver.mavenLocalFile,
    resolvers ++= Seq(DefaultMavenRepository,
    Classpaths.typesafeReleases,
    "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
    "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
    Classpaths.sbtPluginReleases,
    "Eclipse repositories" at "https://repo.eclipse.org/service/local/repositories/egit-releases/content/",
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")
  )
}