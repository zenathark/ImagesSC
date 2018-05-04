import Dependencies._

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "io.zenathark",
      scalaVersion := "2.12.5",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "ImagesSC",
    libraryDependencies += scalaTest % Test
    ,libraryDependencies += "org.typelevel" %% "spire" % "0.14.1"
    ,libraryDependencies += "org.typelevel" %% "spire-extras" % "0.14.1"
    ,libraryDependencies += "com.chuusai" %% "shapeless" % "2.3.3"
  )
