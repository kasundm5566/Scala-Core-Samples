package conditions

/**
  * Created by dinesh on 5/26/17.
  */
object IfElseIf {
  val marks: Int = 61;

  def main(args: Array[String]) {
    if (marks >= 75) {
      println("Very good.")
    } else if (marks <= 74 && marks >= 60) {
      println("Good.")
    } else if (marks <= 59 && marks >= 45) {
      println("Not bad.")
    } else {
      println("Bad.")
    }
  }
}
