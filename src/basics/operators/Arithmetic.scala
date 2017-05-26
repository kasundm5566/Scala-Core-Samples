package basics.operators

/**
  * Created by dinesh on 5/26/17.
  */

/*
  Arithmetic operators.
  +	Adds two operands.
  -	Subtracts second operand from the first.
  *	Multiplies both operands.
  /	Divides numerator by de-numerator.
  %	Modulus operator finds the remainder after division of one number by another.
 */
object Arithmetic {
  val num1: Int = 20;
  val num2: Int = 30;

  def main(args: Array[String]) {
    println("Addition: " + (num1 + num2))
    println("Subtraction: " + (num1 - num2))
    println("Division: " + (num1 / num2))
    println("Division: " + (num1.toDouble / num2.toDouble))
    println("Division: " + "%.2f".format((num1.toDouble / num2.toDouble))) // Rounding to two decimal places
    println("Multiplication: " + (num1 * num2))
    println("Modulus: " + (num1 % num2))
  }
}
