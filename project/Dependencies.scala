import sbt._

object Dependencies {

  object Version {
    val cats          = "2.10.0"
    val `cats-effect` = "3.5.1"
    val `pureconfig`  = "0.17.4"
    val fs2           = "3.8.0"
    val http4s        = "1.0.0-M40"
    val skunk         = "0.6.0"
    val lepus         = "0.4.1"
    val munit         = "1.0.0-M7"
    val `munit-cats`  = "1.0.7"
  }

  lazy val cats: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-kernel",
    "org.typelevel" %% "cats-core",
    "org.typelevel" %% "cats-laws"
  ).map(_ % Version.cats)

  lazy val `cats-effect`: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-effect"
  ).map(_ % Version.`cats-effect`)

  lazy val pureconfig: Seq[ModuleID] = Seq(
    "com.github.pureconfig" %% "pureconfig-core"
  ).map(_ % Version.pureconfig)

  lazy val fs2: Seq[ModuleID] = Seq(
    "co.fs2" %% "fs2-core",
    "co.fs2" %% "fs2-io",
    "co.fs2" %% "fs2-reactive-streams"
  ).map(_ % Version.fs2)

  lazy val http4s: Seq[ModuleID] = Seq(
    "org.http4s" %% "http4s-core",
    "org.http4s" %% "http4s-server",
    "org.http4s" %% "http4s-ember-client",
    "org.http4s" %% "http4s-ember-server",
    "org.http4s" %% "http4s-dsl"
  ).map(_ % Version.http4s)

  lazy val skunk: Seq[ModuleID] = Seq(
    "org.tpolecat" %% "skunk-core"
  ).map(_ % Version.skunk)

  lazy val lepus: Seq[ModuleID] = Seq(
    "dev.hnaderi" %% "lepus-client"
  ).map(_ % Version.lepus)

  lazy val munit: Seq[ModuleID] = Seq(
    "org.scalameta" %% "munit",
    "org.scalameta" %% "munit-scalacheck",
  ).map(_ % Version.munit % Test)

  lazy val `munit-cats-effect`: Seq[ModuleID] = Seq(
    "org.typelevel" %% "munit-cats-effect-3"
  ).map(_ % Version.`munit-cats` % Test)

}
