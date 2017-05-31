package Strings

/**
  * Created by dinesh on 5/31/17.
  */
object StringMethods {
  val str1 = "String 01"
  val str2 = "String 02"

  def main(args: Array[String]) {
    println(s"Concat: ${str1.concat(str2)}")
    println(s"Upper: ${str1.toUpperCase()}")
    println(s"Lower: ${str2.toLowerCase()}")
    println(s"Compare: ${str1.compareTo(str2)}")
    println(s"Length: ${str2.length()}")
    println(s"Substring: ${str2.substring(2, 6)}")
  }
}
