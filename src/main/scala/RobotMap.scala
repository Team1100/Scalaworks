/**
  * Created by zacha on 6/8/2017.
  */
object RobotMap {
  //[D]rive
  val D_FRONT_LEFT = 9 //PWM, Paul
  val D_FRONT_RIGHT = 7 //PWM, Ringo
  val D_BACK_LEFT = 8 //PWM, John
  val D_BACK_RIGHT = 6 //PWM, George
  val D_GYRO = 0 //ANALOG
  val D_GYRO_1 = 1 //ANALOG
  //[U]SB
  val U_XBOX = 0
  val U_STICK = 1
  //[G]ear
  val G_PCM = 1 //CAN
  val G_PCM_2 = 0 //CAN
  val G_PLATE_0 = 0 //DIO
  val G_PLATE_1 = 1 //DIO
  val G_CATCHER = 0 //PCM
  val G_CLAMP_FORWARD = 2//PCM
  val G_CLAMP_REVERSE = 3//PCM
  val G_RAMP_FORWARD = 1//PCM
  val G_RAMP_REVERSE = 0//PCM
}
