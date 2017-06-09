package commands.drive

import _root_.OI
import edu.wpi.first.wpilibj.command.Command
import subsystems.Drive

/**
  * Created by zacha on 6/8/2017.
  */
class UserDrive extends Command{
  requires(Drive.instance)

  override def isFinished: Boolean = false
  override def execute(): Unit = {
    val x = OI.instance.stick.x
    val y = OI.instance.stick.y
    val z = OI.instance.stick.z
    Drive.instance.driveMecanum(x,y,z)
  }

}
