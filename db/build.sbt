import Dependencies._

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "db"
  )

libraryDependencies ++= dependencies

lazy val dependencies =
  circe ++ skunk ++ lepus ++ `named-codec-circe`