object Problem11 {
  def main(args: Array[String]) {
    printf("How many euros are you exchanging? ")
    val Euros: Float = scala.io.StdIn.readLine().toFloat
    printf("What is the exchange rate? ")
    val ExchangeRate: Float = scala.io.StdIn.readLine().toFloat

    val USExchangeRate: Float = 100

    val ValueUSD: Float = (Euros * ExchangeRate) / USExchangeRate

    println("You get " + ValueUSD.toFloat)
  }
}
