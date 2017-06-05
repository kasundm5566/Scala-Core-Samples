package conditions

/**
  * Created by dinesh on 5/26/17.
  */
object SimpleIf {
  val name: String = "John"
  val status: Boolean = true

  def main(args: Array[String]) {
    if (name == "John") {
      println("Name is John.")
    }

    if(status){
      println("Status is true.")
    }
  }
}
