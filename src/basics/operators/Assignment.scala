package basics.operators

/**
  * Created by dinesh on 5/26/17.
  */

/*
  Assignment operators.
  = Simple assignment operator, Assigns values from right side operands to left side operand.
  += Add AND assignment operator, It adds right operand to the left operand and assign the result to left operand.
  -= Subtract AND assignment operator, It subtracts right operand from the left operand and assign the result to left operand.
  *= Multiply AND assignment operator, It multiplies right operand with the left operand and assign the result to left operand.
  /= Divide AND assignment operator, It divides left operand with the right operand and assign the result to left operand.
  %= Modulus AND assignment operator, It takes modulus using two operands and assign the result to left operand.
  <<= Left shift AND assignment operator.
  >>= Right shift AND assignment operator.
  &= Bitwise AND assignment operator.
  ^= bitwise exclusive OR and assignment operator.
  |= bitwise inclusive OR and assignment operator.
 */
object Assignment {
  var num1 = 50

  def main(args: Array[String]): Unit = {
    num1 += 5;
    println("num1 += " + num1)
    num1 -= 5;
    println("num1 -+ " + num1)
    num1 *= 2
    println("num1 *= " + num1)
    num1 /= 4;
    println("num1 /= " + num1)
    num1 %= 10
    println("num1 %= " + num1)
    num1 <<= 2
    println("num1 <<= " + num1)
    num1 >>= 2
    println("num1 >>= " + num1)
    num1 &= 6
    println("num1 &= " + num1)
    num1 ^= 2
    println("num1 ^= " + num1)
    num1 |= 5
    println("num1 |= " + num1)
  }
}
