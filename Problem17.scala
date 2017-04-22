object Problem17 {
  def main(args: Array[String]) {
    printf("Alcohol consumed in oz? ")
    val Alcohol: Float = scala.io.StdIn.readLine().toFloat
    printf("Your weight? ")
    val Weight: Float = scala.io.StdIn.readLine().toFloat
    printf("Your gender (M/F)? ")
    val Gender: String = scala.io.StdIn.readLine()
    printf("Number of hours since last drink? ")
    val Hours: Float = scala.io.StdIn.readLine().toFloat

    if (Gender == "M") {
      val Ratio: Float = (0.73).toFloat
      calculateBAC(Alcohol, Weight, Hours, Ratio)
    } else {
      val Ratio: Float = (0.66).toFloat
      calculateBAC(Alcohol, Weight, Hours, Ratio)
    }
  }

  def calculateBAC(Alcohol: Float, Weight: Float, Hours: Float, Ratio: Float) {
    val BAC: Float = ((Alcohol * 5.14 / Weight * Ratio) - 0.015 * Hours).toFloat

    println("Your BAC is " + BAC.toString)

    if (BAC >= 0.08) {
      println("It is not legal for you to drive")
    } else {
      println("It is legal for you to drive")
    }
  }
}
