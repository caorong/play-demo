logLevel := Level.Debug

resolvers ++= Seq(
    "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
    "Typesafe Maven Repository" at "http://repo.typesafe.com/typesafe/maven-releases/",
    "Typesafe Snapshots" at "https://repo.typesafe.com/typesafe/snapshots/"
    
)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.8")
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

