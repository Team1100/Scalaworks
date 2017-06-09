import RobotMap._
import commands.gear._
import input.Extreme3DPro
import input.XboxController
/**
  * Created by zacha on 6/8/2017.
  */
class OI {
  val xbox = new XboxController(U_XBOX, .2)
  val stick = new Extreme3DPro(U_STICK, .2, .3)

  xbox.buttonA.whenPressed(new OpenCatchers)
  xbox.buttonB.whenPressed(new CloseCatchers)
  xbox.buttonX.whenPressed(new PopClamp)
}

object OI{
  val instance = new OI
}