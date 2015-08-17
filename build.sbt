name := MyBuild.NamePrefix + "root"

version := "0.0.1"

scalaVersion := "2.11.6"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

lazy val common = project.
    settings(Common.settings: _*)

lazy val api = project.
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.apiDependencies)

lazy val client = project.
    dependsOn(api).
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.clientDependencies)

lazy val domain = project.
    dependsOn(api).
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.domainDependencies)

lazy val web = project.
    dependsOn(api, common).
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.webDependencies)

lazy val spark = project.
    dependsOn(api, common).
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.sparkDependencies)

lazy val search = project.
    dependsOn(api, common).
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.searchDependencies)

lazy val root = (project in file(".")).
    aggregate(api, common, client, domain, web, search, spark).
    enablePlugins(PlayScala)