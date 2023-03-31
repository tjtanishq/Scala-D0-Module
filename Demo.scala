// Scala map program of
// Accessing Values Using Keys

// Creating object
object Demo {
  // Main method
  def main(args: Array[String]) {

    val mapIm = Map("Ajay" -> 30,
      "Bhavesh" -> 20,
      "Charlie" -> 50)

    // Accessing score of Ajay
    val ajay = mapIm("Ajay")
    println(ajay)
  }
}
