object Problem9 {
  def main(args: Array[String]) {
    printf("What is the length of your room? ")
    val Length: Int = scala.io.StdIn.readLine().toInt
    printf("What is the width of your room? ")
    val Width: Int = scala.io.StdIn.readLine().toInt

    val GallonPerArea: Int = 350
    val Area: Int = Length * Width

    val PaintRequired: Double = Math.ceil(Area.toDouble / GallonPerArea.toDouble)

    println("You will need " + PaintRequired.toString + " gallons of paint to paint the room.")

  }
}
