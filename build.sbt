name := "UT_IT_assignment"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "org.mockito" %% "mockito-scala" % "1.5.12" % "test")

lazy val module1 = project.in(file("module1")).settings(libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "org.mockito" %% "mockito-scala" % "1.5.12" % "test"))
lazy val module2 = project.in(file("module2")).settings(libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "org.mockito" %% "mockito-scala" % "1.5.12" % "test"))

lazy val UT_IT_assignment = (project in file(".")).aggregate(module1, module2)