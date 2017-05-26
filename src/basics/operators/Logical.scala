package basics.operators

/**
  * Created by dinesh on 5/26/17.
  */

/*
  Logical operators.
  && It is called Logical AND operator. If both the operands are non zero then condition becomes true.
  || It is called Logical OR Operator. If any of the two operands is non zero then condition becomes true.
  ! It is called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.
 */
object Logical {
  val a: Boolean = true
  val b: Boolean = false

  def main(args: Array[String]) {
    println("&& " + (a && b))
    println("|| " + (a || b))
    println("^ " + (a ^ b))
  }
}
