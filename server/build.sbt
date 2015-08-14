name := MyBuild.NamePrefix + "server"

mainClass in (Compile, run) := Some("server.Server")
