object Problem6 {
  def main(args: Array[String]) {
    val Year: Int = 2017
    printf("What is your current age? ")
    val Age: Int = scala.io.StdIn.readLine().toInt
    printf("At what age would you like to retire? ")
    val AgeRetire: Int = scala.io.StdIn.readLine().toInt

    val YearsLeft: String = (AgeRetire - Age).toString
    val YearRetire: String = (Year + AgeRetire).toString

    println("You have " + YearsLeft + " left until you can retire.\nIt's " + Year + ", so you can retire in " + YearRetire)
  }
}
