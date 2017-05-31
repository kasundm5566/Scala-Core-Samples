package functions

/**
  * Created by dinesh on 5/30/17.
  */
object SimpleFunctions {
  def main(args: Array[String]): Unit = {
    addInt1(2, 3)
    val additionResult: Int = addInt2(4, 2)
    println("Addition(return): " + additionResult)
    println("Addition(optional params): " + addInt3())
    println("Addition(no return statement): " + addInt4(15, 10))
  }

  /*
    Function to calculate the sum of two integers.
    It is similar to a void type function (Unit).
  */
  def addInt1(a: Int, b: Int): Unit = {
    println("Addition: " + (a + b))
  }

  /*
    Function to calculate the sum of two integers.
    It returns an integer value of addition.
  */
  def addInt2(a: Int, b: Int): Int = {
    val addition = a + b
    return addition
  }

  /*
    Function to calculate the sum of two integers.
    Parameters have a default values to use if values are not passed.
    It returns an integer value of addition.
  */
  def addInt3(a: Int = 10, b: Int = 5): Int = {
    return a + b
  }

  /*
    Function to calculate the sum of two integers.
    It returns an integer value of addition.
    But it is not used return statement.
    It is assigned the addition (a+b) to the function so it will return that value.
  */
  def addInt4(a: Int, b: Int): Int = {
    a + b
  }
}
