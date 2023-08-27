import Dependencies._

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.3.0"

lazy val foodie = (project in file("."))
  .aggregate(app, db)

lazy val app = (project in file("app"))
  .settings(
    name := "app"
  )
  .settings(commonSettings)

lazy val db = (project in file("db"))
  .settings(
    name := "db"
  )
  .settings(commonSettings)

val commonSettings = List(
  libraryDependencies ++= dependencies,
  javacOptions ++= Seq(
    "-source", "20",
    "-target", "20"
  )
)

lazy val dependencies = cats ++ `cats-effect` ++ fs2 ++ circe ++ skunk ++
                          lepus ++ `named-codec-circe` ++ http4s