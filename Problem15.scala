object Problem15 {
  def main(args: Array[String]) {
    printf("What is the password? ")
    val Password: String = scala.io.StdIn.readLine()

    if (Password != "abc$123") {
      println("Incorrect password!")
    } else {
      println("Welcome!")
    }
  }
}
