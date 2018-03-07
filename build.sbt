name := "wallet"

version := "1.0-SNAPSHOT"
lazy val `wallet` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "com.typesafe.play"      %% "play-slick"              % "3.0.2",
  "com.typesafe.play"      %% "play-slick-evolutions"   % "3.0.2",
  "com.github.tototoshi"   %% "slick-joda-mapper"       % "2.3.0",
  "com.github.nscala-time" %% "nscala-time"             % "2.18.0",
  "org.joda"                % "joda-convert"            % "1.7",
  "org.scalaz"             %% "scalaz-core"             % "7.2.20",
  "io.kanaka"              %% "play-monadic-actions" % "2.1.0",
  "io.lemonlabs"           %% "scala-uri" % "0.5.7",
  "net.debasishg"          %% "redisclient" % "3.5",
  "mysql"                   % "mysql-connector-java" % "5.1.45",
  "io.jsonwebtoken"         % "jjwt" % "0.9.0",
  "com.typesafe.play"      %% "play-json-joda" % "2.6.9",
  "com.h2database"          % "h2" % "1.4.196",
  "com.google.inject.extensions" % "guice-multibindings" % "4.2.0",
  jodaForms,
  guice,
  specs2 % Test,
  ws,
  ehcache
)

//PlayKeys.devSettings := Seq("play.server.http.port" -> "9000")

javaOptions in Test += "-Dconfig.file=conf/test.conf"

packageName in Universal := "wallet-api"

val gentable = "generate app/data/entity/Tables.scala."
val generate = taskKey[Unit](gentable)
generate := {
  import sys.process._
  println("./gentable.sh" !!)
  println(gentable)
}
