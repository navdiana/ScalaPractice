object Problem16 {
  def main(args: Array[String]) {
    printf("What is your age? ")
    val Age: Int = scala.io.StdIn.readLine().toInt

    if (Age < 16) {
      println("You are not old enough to drive...")
    } else {
      println("You are old enough to drive :)")
    }
  }
}
