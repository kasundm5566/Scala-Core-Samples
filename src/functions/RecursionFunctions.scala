package functions

/**
  * Created by dinesh on 5/31/17.
  */
object RecursionFunctions {
  def factorial(num: Int): Int = {
    if (num <= 1) {
      1
    } else {
      num * factorial(num - 1)
    }
  }

  def main(args: Array[String]) {
    println(factorial(5))
  }
}
