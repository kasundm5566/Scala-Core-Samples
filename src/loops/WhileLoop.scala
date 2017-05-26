package loops

/**
  * Created by dinesh on 5/26/17.
  */
object WhileLoop {
  def main(args: Array[String]) {
    var i: Int = 1

    while (i <= 10) {
      println("i: " + i)
      i += 1
    }
  }
}
