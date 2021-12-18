name := "smartPay"

version := "0.1"

scalaVersion := "2.13.7"

val circeVersion = "0.14.1"
val scalaLogging = "3.9.4"
val logbackClassic = "1.2.3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % scalaLogging
libraryDependencies += "ch.qos.logback" % "logback-classic" % logbackClassic

