import sbt._
import Keys._

object Common {
  val appVersion = "0.0.1"

  val settings: Seq[Def.Setting[_]] = Seq(
    version := appVersion,
    scalaVersion := "2.11.6",
    javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xmx2G"),
    scalacOptions ++= Seq("-deprecation", "-unchecked"),
    resolvers += Opts.resolver.mavenLocalFile,
    resolvers ++= Seq(DefaultMavenRepository,

       Resolver.defaultLocal,
       Resolver.mavenLocal,
       // make sure default maven local repository is added... Resolver.mavenLocal has bugs.
       "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
       // For Spark development versions, if you don't want to build spark yourself
       "Apache Staging" at "https://repository.apache.org/content/repositories/staging/",

    Classpaths.typesafeReleases,
    "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
    "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
    Classpaths.sbtPluginReleases,
    "Eclipse repositories" at "https://repo.eclipse.org/service/local/repositories/egit-releases/content/",
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")
  )
}