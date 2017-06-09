package commands.gear

import edu.wpi.first.wpilibj.command.Command
import subsystems.Gear

/**
  * Created by zacha on 6/9/2017.
  */
class ForceClampClose extends Command{
  requires(Gear.instance)
  var finished = false

  override def initialize(): Unit = {finished = false}
  override def execute(): Unit = {
    Gear.instance.closeClamp
    finished = true
  }
  override def isFinished: Boolean = finished
}
