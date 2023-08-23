import Dependencies._

ThisBuild / organization := "foodie"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "Foodie"
  )

libraryDependencies ++= dependencies

lazy val dependencies =
  cats ++ `cats-effect` ++ fs2 ++ pureconfig ++
    http4s ++ skunk ++ lepus ++ `named-codec` ++ `munit-cats-effect`
