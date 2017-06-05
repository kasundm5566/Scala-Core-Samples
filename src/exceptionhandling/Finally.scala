package exceptionhandling

import java.io.File

/**
  * Created by dinesh on 6/5/17.
  */
object Finally {

  def main(args: Array[String]) {
    val file = new File("tt");
    println(file)
    try {
      println(divide(0, 0))
    } catch {
      case ex: ArithmeticException => {
        println("Error: " + ex.getMessage())
      }
    } finally {
      println("Finally...")
    }
  }

  def divide(num1: Int, num2: Int): Int = {
    val divideRes: Int = num1 / num2
    divideRes
  }
}
