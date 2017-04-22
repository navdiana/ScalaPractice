object Problem12 {
  def main(args: Array[String]) {
    printf("Enter the principle: ")
    val Principle: Float = scala.io.StdIn.readLine().toFloat
    printf("Enter the rate of interest: ")
    val Interest: Float = scala.io.StdIn.readLine().toFloat
    printf("Enter the number of years: ")
    val Years: Float = scala.io.StdIn.readLine().toFloat

    val Total: Float = Principle * (1 + ((Interest / 100)  * Years))

    println("Your investment will be worth " + Total.toString)
  }
}
