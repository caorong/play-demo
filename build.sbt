name := "pic-share"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  // "group" % "artifact" % "version"
  "com.typesafe.play" % "play_2.11" % "2.3.8" withSources(),
  "com.typesafe.play" % "play-java-ebean_2.11" % "2.3.8",
  "com.typesafe.play" % "play-jdbc_2.11" % "2.3.8" withSources(),
  anorm,
  "mysql" % "mysql-connector-java" % "5.1.27"
)

lazy val `pic-share` = (project in file(".")).enablePlugins(PlayScala)

ideaExcludeFolders += ".idea"

ideaExcludeFolders += ".idea_modules"

addCommandAlias("generate-project", ";update-classifiers;gen-idea")
