package functions

/**
  * Created by dinesh on 5/31/17.
  */
object CurryingFunctions {

  /*
    String concatenation using a currying function.
   */
  def stringConcat(str1: String)(str2: String): String = {
    str1 + str2
  }

  def main(args: Array[String]) {
    println(stringConcat("Hello")(" World!"))
  }
}
