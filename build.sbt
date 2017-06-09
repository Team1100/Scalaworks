name := "Scalaworks"

version := "1.0"

scalaVersion := "2.12.1"

enablePlugins(FRCPlugin)

teamNumber := 1100

resolvers += "WPILib-Maven" at "http://team846.github.io/wpilib-maven"

libraryDependencies += "edu.wpi.first" % "wpilib" % "2017.3.1"
libraryDependencies += "edu.wpi.first" % "networktables" % "2017.3.1"

//robotClass := "Robot"