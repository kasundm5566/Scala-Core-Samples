package functions

import java.util.Date

/**
  * Created by dinesh on 5/31/17.
  */
object PartiallyAppliedFunction {

  def main(args: Array[String]) {
    // Normal way to call log method.
    // Here it needs to pass date as a parameter always.
    val date = new Date();
    log(date, "first message.")
    Thread.sleep(1000)
    log(date, "second message.")
    Thread.sleep(1000)

    // Now, let's do like this.
    val modifiedLog = log(date, _: String)

    modifiedLog("new first message.")
    Thread.sleep(1000)
    modifiedLog("new second message.")
  }

  def log(date: Date, message: String): Unit = {
    println(date + "-----" + message)
  }
}
