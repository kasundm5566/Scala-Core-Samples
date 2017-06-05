package Arrays

import Array._

/**
  * Created by dinesh on 5/31/17.
  */
object MultiDimension {
  val matrix = ofDim[Int](3, 4)

  def main(args: Array[String]) {
    for (i <- 0 until 3) {
      for (j <- 0 until 4) {
        matrix(i)(j) = j
      }
    }

    for (i <- 0 until 3) {
      for (j <- 0 until 4) {
        print(matrix(i)(j) + " ")
      }
      println()
    }
  }
}
