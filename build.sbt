name := """tweetTrends"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
	"org.reactivemongo"	%%	"play2-reactivemongo"	%	"0.11.0-SNAPSHOT",
	"org.scalatest" 	%% 	"scalatest" 		% 	"2.2.4" 		% 	"test"	
)
