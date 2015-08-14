name := MyBuild.NamePrefix + "root"

version := "0.0.1"

scalaVersion := "2.11.6"

lazy val common = project.
    settings(Common.settings: _*)

lazy val api = project.
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.apiDependencies)

lazy val client = project.
    dependsOn(api).
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.clientDependencies)

lazy val server = project.
    dependsOn(api).
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.serverDependencies)

lazy val web = project.
    dependsOn(api, common).
    settings(Common.settings: _*).
    settings(libraryDependencies ++= Dependencies.serverDependencies)

lazy val root = (project in file(".")).
    aggregate(api, common, client, server, web)