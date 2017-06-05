package exceptionhandling

/**
  * Created by dinesh on 6/5/17.
  */
object SimpleException {

  def main(args: Array[String]): Unit = {
    try {
      println(divide(0, 0))
    } catch {
      case ex: ArithmeticException => {
        println("Error: " + ex.getMessage())
      }
    }
  }

  def divide(num1: Int, num2: Int): Int = {
    val divideRes: Int = num1 / num2
    divideRes
  }
}
