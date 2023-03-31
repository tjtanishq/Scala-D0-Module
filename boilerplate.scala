case class NewLanguage(title: String, rating: Double)

object boilerplate {
  def main(args: Array[String]) {
    val stream = NewLanguage("Scala", 8.2)
    stream match {
      case NewLanguage("CSharp", _) =>
        println("Developed: Microsoft, Anders Hejlsberg")
      case NewLanguage("Scala", _) =>
        println("Developed: XENONSTACK, TANISHQ JAIN")
      case _ =>
        println("No match found")
    }
  }
}
