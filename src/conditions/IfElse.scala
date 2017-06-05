package conditions

/**
  * Created by dinesh on 5/26/17.
  */
object IfElse {
  val name: String = "Johnson"
  val status: Boolean = false

  def main(args: Array[String]) {
    if (name == "John") {
      println("Name is John.")
    }else{
      println("Name is not John.")
    }

    if(status){
      println("Status is true.")
    }else{
      println("Status is false")
    }
  }
}
