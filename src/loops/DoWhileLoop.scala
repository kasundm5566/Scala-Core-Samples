package loops

import scala.reflect.macros.whitebox

/**
  * Created by dinesh on 5/26/17.
  */
object DoWhileLoop {
  var i: Int = 1

  def main(args: Array[String]): Unit = {
    do {
      println("i: " + i)
      i += 1
    } while (i <= 10)
  }
}
