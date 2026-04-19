name := """klyra"""
organization := "com.selimrepo"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.18"
resolvers += "jitpack" at "https://jitpack.io"
libraryDependencies += guice
libraryDependencies += "com.github.selimrepo" % "bahir" % "master-SNAPSHOT"
libraryDependencies += "com.github.selimrepo" % "eagle" % "master-SNAPSHOT"
libraryDependencies += "com.github.selimrepo" % "drat" % "master-SNAPSHOT"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.2" % Test
libraryDependencies += "com.github.selimrepo" % "chukwa" % "master-SNAPSHOT"	
// Adds additional packages into Twirl
TwirlKeys.templateImports += "com.selimrepo.controllers._"

// Adds additional packages into conf/routes
play.sbt.routes.RoutesKeys.routesImport += "com.selimrepo.binders._"
