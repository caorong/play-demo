name := "pic-share"

version := "1.0"

scalaVersion := "2.11.1"


libraryDependencies ++= Seq( jdbc , anorm , cache )

lazy val `pic-share` = (project in file(".")).enablePlugins(PlayScala)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

