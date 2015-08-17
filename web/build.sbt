name := MyBuild.NamePrefix + "web"

enablePlugins(PlayScala)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

//play.Project.playScalaSettings