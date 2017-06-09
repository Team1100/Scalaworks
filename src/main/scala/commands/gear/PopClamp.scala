package commands.gear

import edu.wpi.first.wpilibj.command.Command
import subsystems.Gear

/**
  * Created by zacha on 6/8/2017.
  */
class PopClamp extends Command{
  requires(Gear.instance)
  var finished = false
  var timeOpened:Long = 0

  override def initialize(): Unit = {finished = false; timeOpened = 0}
  override def execute():Unit = {
    if(timeOpened==0){
      Gear.instance.openClamp
      timeOpened = System.currentTimeMillis()
    }else{
      if(System.currentTimeMillis()-timeOpened>=1000){
        Gear.instance.closeClamp
        finished = true
      }
    }
  }
  override def isFinished: Boolean = finished
}
