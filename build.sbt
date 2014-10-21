scalaVersion := "2.10.4"

organization := "org.iwag"

name := "genclient"

com.twitter.scrooge.ScroogeSBT.newSettings

libraryDependencies ++= Seq(
  "org.scala-lang" % "jline"                  % "2.10.0-M2",
  "com.twitter"    %% "scrooge-core"          % "3.16.3",
  "com.twitter"    %% "scrooge-ostrich"          % "3.16.3"
)


resolvers += "twitter" at "http://maven.twttr.com"
