package subsystems

import _root_.RobotMap._
import commands.drive.UserDrive
import edu.wpi.first.wpilibj.{RobotDrive, Victor}
import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable


/**
  * Created by zacha on 6/8/2017.
  */
class Drive extends Subsystem{

  private val frontLeft = new Victor(D_FRONT_LEFT)
  private val frontRight = new Victor((D_FRONT_RIGHT))
  private val backLeft = new Victor(D_BACK_LEFT)
  private val backRight = new Victor(D_BACK_RIGHT)

  private val driveTrain = new RobotDrive(backLeft,frontLeft,backRight,frontRight)

  val DriveLWS:Array[LiveWindowSendable] = Array(frontLeft.asInstanceOf[LiveWindowSendable],
    frontRight.asInstanceOf[LiveWindowSendable],
    backLeft.asInstanceOf[LiveWindowSendable],
    backRight.asInstanceOf[LiveWindowSendable],
    driveTrain.asInstanceOf[LiveWindowSendable])

  override def initDefaultCommand(): Unit = setDefaultCommand(new UserDrive)

  def driveMecanum(x:Double ,y:Double, z:Double):Unit = driveTrain.mecanumDrive_Cartesian(x, y, z, 0)
}

object Drive{
  val instance = new Drive
}
