package Strings

/**
  * Created by dinesh on 5/31/17.
  */
object Interpolators {
  val name = "Sam"
  val age = 25
  val height = 1.9

  def main(args: Array[String]) {
    //------  s interpolator
    /*
      The literal ‘s’ allows the usage of variable directly in processing a string,
      when you prepend ‘s’ to it.
      e.g: Can access variable name using $name.
     */
    println(s"Name: $name, age: $age")
    println(s"Next year $name\'s age: ${age + 1}")

    //------ f interpolator
    /*
      The literal ‘f’ interpolator allows to create a formatted String,
      similar to printf in C language. While using ‘f’ interpolator,
      all variable references should be followed by the printf style format specifiers such as %d, %i, %f, etc.
     */
    println(f"$name%s is $height%2.2f meters tall")

    //------  raw interpolator
    /*
      The ‘raw’ interpolator is similar to ‘s’ interpolator except that it performs no escaping of literals within a string.
      It will print the complete string with escape letters.
     */
    println(raw"$name%s is $height%2.2f meters tall")
  }
}
