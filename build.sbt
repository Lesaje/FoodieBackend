import Dependencies._

ThisBuild / organization := "foodie"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.3.0"

libraryDependencies += "org.tpolecat" %% "skunk-core" % "0.6.0"
libraryDependencies += "dev.hnaderi" %% "lepus-client" % "0.4.1"

lazy val root = (project in file("."))
  .settings(
    name := "Foodie"
  )

libraryDependencies ++= dependencies

lazy val dependencies =
  cats ++ `cats-effect` ++ fs2 ++ circe ++ pureconfig ++
    http4s ++ skunk ++ lepus ++ `named-codec-circe` ++ `munit-cats-effect`
