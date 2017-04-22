object Problem8 {
  def main(args: Array[String]) {
    printf("How many people? ")
    val People: Int = scala.io.StdIn.readLine().toInt
    printf("How many pizzas do you have? ")
    val Pizzas: Int = scala.io.StdIn.readLine().toInt
    val SlicesPerPizza: Int = 10
    val TotalSlices: Int = Pizzas * SlicesPerPizza
    val SlicesPerPerson: Double = TotalSlices / People

    println("With " + People.toString + " people and " + Pizzas.toString + " each person gets " + SlicesPerPerson.toString + " slices")
  }
}
