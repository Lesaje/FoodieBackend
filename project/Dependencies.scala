import sbt._

object Dependencies {

  object Version {
    val cats                = "2.10.0"
    val `cats-effect`       = "3.5.1"
    val fs2                 = "3.8.0"
    val skunk               = "0.6.0"
    val lepus               = "0.4.1"
    val circe               = "0.14.5"
    val `named-codec-circe` = "0.1.0"
    val http4s              = "1.0.0-M40"
  }

  lazy val cats: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-kernel",
    "org.typelevel" %% "cats-core",
    "org.typelevel" %% "cats-laws"
  ).map(_ % Version.cats)

  lazy val `cats-effect`: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-effect"
  ).map(_ % Version.`cats-effect`)

  lazy val fs2: Seq[ModuleID] = Seq(
    "co.fs2" %% "fs2-core",
    "co.fs2" %% "fs2-io",
    "co.fs2" %% "fs2-reactive-streams"
  ).map(_ % Version.fs2)

  lazy val skunk: Seq[ModuleID] = Seq(
    "org.tpolecat" %% "skunk-core"
  ).map(_ % Version.skunk)

  lazy val lepus: Seq[ModuleID] = Seq(
    "dev.hnaderi" %% "lepus-client",
    "dev.hnaderi" %% "lepus-std",
    "dev.hnaderi" %% "lepus-circe"
  ).map(_ % Version.lepus)

  lazy val `named-codec-circe`: Seq[ModuleID] = Seq(
    "dev.hnaderi" %% "named-codec-circe"
  ).map(_ % Version.`named-codec-circe`)

  lazy val circe: Seq[ModuleID] = Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic"
  ).map(_ % Version.circe)

  lazy val http4s: Seq[ModuleID] = Seq(
    "org.http4s" %% "http4s-core",
    "org.http4s" %% "http4s-server",
    "org.http4s" %% "http4s-ember-client",
    "org.http4s" %% "http4s-ember-server",
    "org.http4s" %% "http4s-dsl",
    "org.http4s" %% "http4s-circe"
  ).map(_ % Version.http4s)

}
