object Zip {
  def main(args: Array[String]) = {
    val list = List(1, 2, 3 ,4)
    val list1 = List("A", "B", "C", "D")
    //apply operation to create a zip of list
    val list2 = list zip list1
    //print list
    println(list2)
  }
}