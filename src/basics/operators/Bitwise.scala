package basics.operators

/**
  * Created by dinesh on 5/26/17.
  */

/*
  Binary operators.
  &	Binary AND Operator copies a bit to the result if it exists in both operands.
  |	Binary OR Operator copies a bit if it exists in either operand.
  ^	Binary XOR Operator copies the bit if it is set in one operand but not both.
  ~	Binary Ones Complement Operator is unary and has the effect of 'flipping' bits. 1s to 0s and 0s to 1.
  << Binary Left Shift Operator. The bit positions of the left operands value is moved left by the number of bits specified by the right operand.
  >> Binary Right Shift Operator. The Bit positions of the left operand value is moved right by the number of bits specified by the right operand.
  >>> Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.
 */
object Bitwise {
  val num1: Int = 60;
  // 60 = 0011 1100
  val num2: Int = 13;
  // 13 = 0000 1101
  var result: Int = 0;

  def main(args: Array[String]) {
    result = num1 & num2 // 12 = 0000 1100
    println("a & b = " + result)

    result = num1 | num2 // 61 = 0011 1101
    println("a | b = " + result)

    result = num1 ^ num2 // 49 = 0011 0001
    println("a ^ b = " + result)

    result = ~num1; // -61 = 1100 0011
    println("~a = " + result)

    result = num1 << 2; // 240 = 1111 0000
    println("a << 2 = " + result)

    result = num1 >> 2; // 215 = 1111
    println("a >> 2  = " + result)

    result = num1 >>> 2; // 215 = 0000 1111
    println("a >>> 2 = " + result)
  }
}
