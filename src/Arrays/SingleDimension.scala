package Arrays

import Array._

/**
  * Created by dinesh on 5/31/17.
  */
object SingleDimension {

  val names1: Array[String] = new Array[String](3); // ["Sam", "John", "Peter"]
  names1(0) = "Sam"
  names1(1) = "John"
  names1(2) = "Peter"

  val names2 = new Array[String](3); // ["Sam", "John", "Peter"]
  names2(0) = "Sam"
  names2(1) = "John"
  names2(2) = "Peter"

  val names3 = Array("Sam", "John", "Peter") // ["Sam", "John", "Peter"]

  def main(args: Array[String]) {

    for (i <- 0 until names1.length) {
      println(names1(i))
    }

    println("------------")
    for (i <- 0 to names1.length - 1) {
      println(names1(i))
    }

    println("------------")
    for (name: String <- names3) {
      println(name)
    }

    println("------------")
    val allNames = concat(names1, names2);
    print("Concatinated array: [")
    for (x <- allNames) {
      print(x + " ")
    }
    print("]")
    println()
  }
}
