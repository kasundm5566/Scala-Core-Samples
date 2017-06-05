package conditions

/**
  * Created by dinesh on 5/26/17.
  */
object SwitchCase {
  var grade: Char = 'B'

  def main(args: Array[String]): Unit = {
    grade match {
      case 'A' => println("Great.")
      case 'B' => println("Good.")
      case 'C' => println("Not bad.")
      case 'W' => println("Bad.")
      case _ => println("Invalid grade.")
    }
  }
}
