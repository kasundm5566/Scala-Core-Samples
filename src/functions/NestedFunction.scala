package functions

/**
  * Created by dinesh on 5/30/17.
  */
object NestedFunction {

  def functionA(id: Int): String = {
    id match {
      case 1 => return "A"
      case 2 => return "B"
      case 3 => return "C"
      case _ => return "Z"
    }
  }

  def functionB(stringChar: String): Int = {
    stringChar match {
      case "A" => return 1
      case "B" => return 2
      case "C" => return 3
      case "Z" => return 0
    }
  }

  def main(args: Array[String]) {
    println(functionA(functionB("B")))
  }
}
