import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.5",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "ImagesSC",
    libraryDependencies += scalaTest % Test
    ,libraryDependencies += "org.typelevel" %% "spire" % "0.14.1"
  )
