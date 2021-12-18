name := "smartPay"

version := "0.1"

scalaVersion := "2.13.7"

lazy val circeVersion = "0.14.1"
lazy val scalaLogging = "3.9.4"
lazy val logbackClassic = "1.2.3"
lazy val scalaTest = "3.2.8"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % scalaLogging
libraryDependencies += "ch.qos.logback" % "logback-classic" % logbackClassic
libraryDependencies += "org.scalatest" %% "scalatest" % scalaTest
