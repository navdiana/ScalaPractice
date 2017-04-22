object Problem7 {
  def main(args: Array[String]) {
    printf("What is the length of the room in feet? ")
    val Length: Int = scala.io.StdIn.readLine().toInt
    printf("What is the width of the room in feet? ")
    val Width: Int = scala.io.StdIn.readLine().toInt

    val Area: String = (Length * Width).toString
    val AreaMeters: String = ((Length * Width) * 0.09290304).toString

    println("The area is " + Area + " in feet and " + AreaMeters + " in meters.")
  }
}
