package input

import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.buttons.JoystickButton
import enums.XboxAxis

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

  def getAxis(axis:XboxAxis): Double ={
    val value = getRawAxis(axis.value)
    if(Math.abs(value)>=deadband) value else 0
  }
}
