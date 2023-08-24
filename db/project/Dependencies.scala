import sbt._

object Dependencies {

  object Version {
    val skunk               = "0.6.0"
    val lepus               = "0.4.1"
    val circe               = "0.14.5"
    val `named-codec-circe` = "0.1.0"
  }

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

}
