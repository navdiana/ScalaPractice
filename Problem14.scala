object Problem14 {
  def main(args: Array[String]) {
    printf("What is the order amount? ")
    val Amount: Double = scala.io.StdIn.readLine.toFloat
    printf("what is the state? ")
    val State: String = scala.io.StdIn.readLine

    if (State == "WI") {
      val Tax: Double = Amount * 0.055
      val Total = Amount + Tax
      println("Tax is " + Tax.toString)
      println("The total is " + Total.toString)
    } else {
      val Total = Amount
      printf("The total is " + Total.toString)
    }
  }
}
