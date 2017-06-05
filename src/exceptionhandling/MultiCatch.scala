package exceptionhandling

/**
  * Created by dinesh on 6/5/17.
  */
object MultiCatch {
  def main(args: Array[String]) {
    try {
      println(divide(0, 0))
    } catch {
      case ex: ArithmeticException => {
        println("Arithmetic exception: " + ex.getMessage())
      }
      case ex: NullPointerException => {
        println("Null pointer exception: " + ex.getMessage())
      }
      case _ => {
        println("Uncaught exception.")
      }
    }
  }

  def divide(num1: Int, num2: Int): Int = {
    val divideRes: Int = num1 / num2
    divideRes
  }
}
