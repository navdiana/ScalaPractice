object Problem4 {
  def main(args: Array[String]) {
    printf("Enter a noun: ")
    val noun = scala.io.StdIn.readLine()
    printf("Enter a verb: ")
    val verb = scala.io.StdIn.readLine()
    printf("Enter an adjective: ")
    val adjective = scala.io.StdIn.readLine()
    printf("Enter an adverb: ")
    val adverb = scala.io.StdIn.readLine()
    println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious.")
  }
}
