package commands.gear

import edu.wpi.first.wpilibj.command.Command
import subsystems.Gear

/**
  * Created by zacha on 6/8/2017.
  */
class ClampDefault extends Command{
  requires(Gear.instance)

  override def execute(): Unit = {
    if(Gear.instance.isPegIn) Gear.instance.openCatcher
    else Gear.instance.closeCatcher
  }

  override def isFinished: Boolean = false
}
