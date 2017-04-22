object Problem19 {
  def main(args: Array[String]) {
    printf("What is your weight? ")
    val Weight: Float = scala.io.StdIn.readLine().toFloat
    printf("What is your height? ")
    val Height: Float = scala.io.StdIn.readLine().toFloat

    val BMI: Float = (Weight / (Height * Height)) * 703

    println("Your BMI is " + BMI.toString)

    if (BMI > 18.5 && BMI < 25) {
      println("You are within the healthy range for BMI")
    } else if (BMI < 18.5) {
      println("You are underweight...")
    } else if (BMI > 25) {
      println("You are overweight...")
    }
  }
}
