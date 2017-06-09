# Scalaworks
A translation of parts of the FRCSteamworks code into the Scala programming language.

This project, while done for my own enjoyment, bears the hope that some future 1100 programmer will take it upon themselves to write 
a large portion of the robot code in Scala.

The FRC-SBT plugin I am using can be found here: https://github.com/Team846/sbt-frc 

# Usage
This code was written in Scala using Intellij IDEA. You will need to install both the Scala SBT and the Scala Intellij plugin.

As laid out in the handy instructions from Team 846, you will need to have your plugins.sbt and build.sbt matching exactly what I 
have here.

To deploy to the robot, you should be able to run "sbt deploy" from the terminal within Intellij. There is a first time deployment step 
that involves copying a file to the Rio outlined on Team 846's page.

If you want to expand this project feel free. Just don't give in and start writing Java classes! Yes they will work, but that defeats the
whole point of trying to write the code in a new and fun lanugage!
