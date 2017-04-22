object Problem10 {
  def main(args: Array[String]) {
    printf("Enter the price of item 1: ")
    val Item1: Int = scala.io.StdIn.readLine().toInt
    printf("Enter the quantity of item 1: ")
    val Quantity1: Int = scala.io.StdIn.readLine().toInt
    printf("Enter the price of item 2: ")
    val Item2: Int = scala.io.StdIn.readLine().toInt
    printf("Enter the quantity of item 2: ")
    val Quantity2: Int = scala.io.StdIn.readLine().toInt
    printf("Enter the price of item 3: ")
    val Item3: Int = scala.io.StdIn.readLine().toInt
    printf("Enter the quantity of item 3: ")
    val Quantity3: Int = scala.io.StdIn.readLine().toInt

    val Subtotal: Int = (Item1 * Quantity1) + (Item2 * Quantity2) + (Item3 * Quantity3)
    val Tax: Double = Subtotal * 0.13

    val Total: Double = Subtotal + Tax

    println("Subtotal is: " + Subtotal.toString + "\nTax is: " + Tax.toString + "\nTotal is: " + Total.toString)
  }
}
