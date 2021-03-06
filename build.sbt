name := "spark-scala"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.2.0"

libraryDependencies += "org.apache.spark" %% "spark-core" % s"${sparkVersion}"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % s"${sparkVersion}"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % s"${sparkVersion}"
libraryDependencies += "org.apache.spark" % "spark-hive_2.11" % s"${sparkVersion}"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
libraryDependencies += "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.5"
// Contains Jetty implementation and other network features
libraryDependencies += "org.apache.spark" % "spark-network-common_2.11" % s"${sparkVersion}"
// Yarn cluster manager code
libraryDependencies += "org.apache.spark" % "spark-yarn_2.11" % s"${sparkVersion}"
// https://mvnrepository.com/artifact/com.h2database/h2
libraryDependencies += "com.h2database" % "h2" % "1.4.195"
libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6"


