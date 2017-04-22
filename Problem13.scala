object Problem13 {
  def main(args: Array[String]) {
    printf("Enter the principle: ")
    val Principle: Float = scala.io.StdIn.readLine().toFloat
    printf("Enter the rate of interest: ")
    val Interest: Float = scala.io.StdIn.readLine().toFloat
    printf("Enter the number of years: ")
    val Years: Float = scala.io.StdIn.readLine().toFloat
    printf("Number of compounds per year: ")
    val Compound: Float = scala.io.StdIn.readLine().toFloat

    val Total = Principle * Math.pow( (1 + ( (Interest/100) / Compound )) , (Compound * Years) )

    println("Your investment will be worth " + Total.toString)
  }
}
