package Arrays

/**
  * Created by dinesh on 5/31/17.
  */
object ArrayWithRange {
  val numList1 = Array.range(1, 11)
  val numList2 = Array.range(2, 11, 2)

  def main(args: Array[String]) {
    for (num <- numList1) {
      print(num + " ")
    }
    println()

    for (num <- numList2) {
      print(num + " ")
    }
    println()
  }
}
