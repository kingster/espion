
organization := "com.flipkart"

name := "espion"

version := "1.0.6"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.12.4",
  "io.dropwizard.metrics" % "metrics-core" % "3.1.0"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

ThisBuild / publishTo := {
  val nexus = "http://artifactory.fkinternal.com/artifactory/v1.0/artifacts/"
  if (isSnapshot.value) 
    Some("snapshots" at nexus + "libs-snapshots-local")
  else 
    Some("releases" at nexus + "libs-release-local")
}