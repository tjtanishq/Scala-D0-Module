object LinearSearch {
  def linearSearch[T](items: List[T], searchElem: T): Boolean = {
    if (items.isEmpty) false
    else if (items.head == searchElem) true
    else linearSearch(items.tail, searchElem)
  }

  def main(args: Array[String]): Unit = {
    println(linearSearch(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 20, 34, 56, 345, 1245), 10))
    println(linearSearch(List("a", "b"), "b"))
    println(linearSearch(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 20, 34, 56, 345, 1245), 15))
  }
}