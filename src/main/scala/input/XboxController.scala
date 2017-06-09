package input

import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.buttons.JoystickButton

/**
  * Created by zacha on 6/9/2017.
  */
class XboxController(port: Int, deadband: Double) extends Joystick(port: Int){
  val buttonA = new JoystickButton(this, 1)
  val buttonB = new JoystickButton(this, 2)
  val buttonX = new JoystickButton(this, 3)
  val buttonY = new JoystickButton(this, 4)
  val buttonLeftBumper = new JoystickButton(this, 5)
  val buttonRightBumper = new JoystickButton(this, 6)
  val buttonBack = new JoystickButton(this, 7)
  val buttonStart = new JoystickButton(this, 8)
  val buttonLeftStick = new JoystickButton(this, 9)
  val buttonRightStick = new JoystickButton(this, 10)

  object XboxAxis{
    sealed abstract class XboxAxis(val value: Int)

    case object kxLeft extends XboxAxis(0)
    case object kyLeft extends XboxAxis(1)
    case object kLeftTrigger extends XboxAxis(2)
    case object kRightTrigger extends XboxAxis(3)
    case object kxRight extends XboxAxis(4)
    case object kyRight extends XboxAxis(5)
  }

  import XboxAxis._

  def getAxis(axis:XboxAxis): Double ={
    val value = getRawAxis(axis.value)
    if(Math.abs(value)>=deadband) value else 0
  }
}
