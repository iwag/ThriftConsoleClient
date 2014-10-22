scalaVersion := "2.10.4"

organization := "org.iwag"

name := "genclient"

com.twitter.scrooge.ScroogeSBT.newSettings

libraryDependencies ++= Seq(
//  "org.scala-lang" % "jline"                  % "2.10.0-M2", // be comented for sbt assembly
  "com.twitter"    %% "scrooge-core"          % "3.16.3",
  "com.twitter"    %% "scrooge-ostrich"          % "3.16.3"
)

resolvers += "twitter" at "http://maven.twttr.com"

assemblySettings

//mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
//{
//  case "META-INF/MANIFEST.MF" => MergeStrategy.discard
//  case x => MergeStrategy.first
//}
//}
