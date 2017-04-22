object Problem18 {

  def main(args: Array[String]) {
    printf("Converting Celsius or Fahrenheit? (C/F)")
    val Type: String = scala.io.StdIn.readLine()
    if (Type == "C") {
      CalculateCelsius()
    } else {
      CalculateFahrenheit()
    }
  }

  def CalculateCelsius() {
    printf("Temperature in Celsius? ")
    val Temperature: Float = scala.io.StdIn.readLine().toFloat
    val Conversion: Float = (Temperature * 9 / 5) + 32
    println("The temperature in Fahrenheit is " + Conversion.toString)
  }

  def CalculateFahrenheit() {
    printf("Temperature in Fahrenheit? ")
    val Temperature: Float = scala.io.StdIn.readLine().toFloat
    val Conversion: Float = (Temperature - 32) * 5 / 9
    println("The temperature in Celsius is " + Conversion.toString)
  }

}
