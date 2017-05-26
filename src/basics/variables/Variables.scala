package basics.variables

/**
  * Created by dinesh on 5/26/17.
  */

/*
  val: Immutable variable. Value can not be changed once assigned.
  var: Mutable variable. Can assign and update values.
  We can define a 'val','var' with or without the data type.
  If we do not define a data type, it will assign the data type of the value assigned first.
 */
object Variables {
  val valueWithoutType = "Hello Val"
  val valueWithType: Int = 10

  var variableWithoutType = "Hello Var"
  var variableWithType: Int = 20

  def main(args: Array[String]) {
    println(valueWithoutType + " | " + valueWithoutType.getClass())
    println(valueWithType + " | " + valueWithType.getClass())

    println(variableWithoutType + " | " + variableWithoutType.getClass())
    println(variableWithType + " | " + variableWithType.getClass())
  }
}
