object Problem5 {
  def main(args: Array[String]) {
    printf("First Number: ")
    val input1: String = scala.io.StdIn.readLine()
    printf("Second Number: ")
    val input2: String = scala.io.StdIn.readLine()

    val number1: Int = input1.toInt
    val number2: Int = input2.toInt

    println(input1 + " + " + input2 + " = " + (number1 + number2).toString)
    println(input1 + " - " + input2 + " = " + (number1 - number2).toString)
    println(input1 + " * " + input2 + " = " + (number1 * number2).toString)
    println(input1 + " / " + input2 + " = " + (number1 / number2).toString)
  }
}
