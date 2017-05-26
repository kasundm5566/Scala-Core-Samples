package conditions

/**
  * Created by dinesh on 5/26/17.
  */
object NestedIf {
  var num1: Int = 50
  var num2: Int = 30

  def main(args: Array[String]) {
    if (num1 == 50) {
      if (num2 == 30) {
        println("num1 is 50 and num2=30.")
      }
    }
  }
}
