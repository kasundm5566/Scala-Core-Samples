package basics.operators

/**
  * Created by dinesh on 5/26/17.
  */

/*
  Relational operators.
  ==	Checks if the values of two operands are equal or not, if yes then condition becomes true.
  !=	Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.
  >	Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.
  <	Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.
  >=	Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.
  <=	Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.
 */
object Relational {
  val num1 = 20
  val num2 = 30

  def main(args: Array[String]) {
    println("== " + (num1 == num2))
    println("!= " + (num1 != num2))
    println("> " + (num1 > num2))
    println("< " + (num1 < num2))
    println(">= " + (num1 >= 20))
    println("<= " + (num1 <= 20))
  }
}
