package subsystems

import _root_.RobotMap._
import edu.wpi.first.wpilibj.DoubleSolenoid.Value._
import edu.wpi.first.wpilibj.{DigitalInput, DoubleSolenoid, Solenoid}
import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable

/**
  * Created by zacha on 6/8/2017.
  */
class Gear extends Subsystem{
  private val catcher = new Solenoid(G_PCM, G_CATCHER)
  private val clamp = new DoubleSolenoid(G_PCM_2, G_CLAMP_FORWARD, G_CLAMP_REVERSE)
  private val ramp = new DoubleSolenoid(G_PCM_2, G_RAMP_FORWARD, G_RAMP_REVERSE)

  private val plate = new DigitalInput(G_PLATE_0)
  private val plate1 = new DigitalInput(G_PLATE_1)

  val GearLWS:Array[(LiveWindowSendable, String)] = Array((catcher.asInstanceOf[LiveWindowSendable],"Side Catcher"),
    (clamp.asInstanceOf[LiveWindowSendable],"Clamp"),
    (ramp.asInstanceOf[LiveWindowSendable],"Ramp"))

  def openRamp: Unit = ramp.set(kReverse)
  def closeRamp: Unit = ramp.set(kForward)

  def openClamp: Unit = clamp.set(kReverse)
  def closeClamp: Unit = clamp.set(kForward)

  def openCatcher: Unit = catcher.set(true)
  def closeCatcher: Unit = catcher.set(false)

  def isPegIn: Boolean = !(plate.get() && plate1.get())

  override def initDefaultCommand(): Unit = {}
}

object Gear{
  val instance = new Gear
}
