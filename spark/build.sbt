name := MyBuild.NamePrefix + "spark"

mainClass in (Compile, run) := Some("spark.SparkMain")
