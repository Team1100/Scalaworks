package commands.gear

import edu.wpi.first.wpilibj.command.Command
import subsystems.Gear

/**
  * Created by zacha on 6/8/2017.
  */
class CloseCatchers extends Command{
  requires(Gear.instance)
  var finished = false

  override def initialize(): Unit = {finished = false}

  override def execute(): Unit = {
    Gear.instance.closeCatcher
    Gear.instance.closeRamp
    finished = true
  }

  override def isFinished: Boolean = finished
}
