package loops

/**
  * Created by dinesh on 5/26/17.
  */
object ForLoop {
  def main(args: Array[String]) {
    var i: Int = 0

    println("//-----For with to")
    // Inclusive 10
    for (i <- 1 to 10) {
      println("i: " + i)
    }

    println("//-----For with until")
    // Exclusive of 10
    for (i <- 1 until 10) {
      println("i: " + i)
    }

    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("//-----For each")
    // for loop execution with multiple filters
    for (i <- numList) {
      println("i: " + i)
    }
  }
}
