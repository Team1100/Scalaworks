package input

import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.Joystick.AxisType
import edu.wpi.first.wpilibj.buttons.JoystickButton

/**
  * Created by zacha on 6/8/2017.
  */
class Extreme3DPro (port: Int, deadband : Double, rotateDeadband : Double)extends Joystick(port: Int) {
  private val buttons:Array[JoystickButton] = for(i<- (1 to 11).toArray) yield new JoystickButton(this,i)
  def button(number : Int):JoystickButton = buttons(number-1)

  override def getAxis(axis : AxisType): Double ={
    val value = super.getAxis(axis)
    val band = if(axis.equals(AxisType.kZ))rotateDeadband else deadband
    if(Math.abs(value) <= deadband) 0 else value
  }

  def x: Double = getAxis(AxisType.kX)
  def y: Double = getAxis(AxisType.kY)
  def z: Double = getAxis(AxisType.kZ)
}
