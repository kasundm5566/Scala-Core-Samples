package functions

/**
  * Created by dinesh on 5/31/17.
  */
object AnonymousFunctions {

  /*
    Anonymous function with single parameter.
    Returns a value by incrementing parameter by 1.
   */
  var inc = (x: Int) => x + 1

  /*
    Anonymous function with multiple parameter.
    Returns a value by adding the parameters.
   */
  var add = (x: Int, y: Int) => x + y

  /*
    Anonymous function with no parameters.
   */
  var userDir = () => System.getProperty("user.dir")

  def main(args: Array[String]) {
    println(inc(5))
    println(inc(5) + 10)
    println(add(5, 3))
    println(userDir)
  }
}
