import edu.wpi.first.wpilibj.command.Scheduler
import edu.wpi.first.wpilibj.livewindow.LiveWindow
import edu.wpi.first.wpilibj.IterativeRobot
import subsystems.Drive

/**
  * Created by zacha on 6/8/2017.
  */
class Robot extends IterativeRobot{
  override def robotInit(): Unit = {}

  override def disabledInit(): Unit = {}

  override def disabledPeriodic(): Unit = Scheduler.getInstance().run()

  override def autonomousInit(): Unit = {}

  override def autonomousPeriodic(): Unit = Scheduler.getInstance().run()

  override def teleopInit(): Unit = {}

  override def teleopPeriodic(): Unit = Scheduler.getInstance().run()

  override def testInit(): Unit = {}

  override def testPeriodic(): Unit = LiveWindow.run()
}
