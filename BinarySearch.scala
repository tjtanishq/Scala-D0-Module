object BinarySearch {
  def binarySearch[T](items: List[T], find: T)(implicit ordering: Ordering[T]): Boolean = {
    if (items.length == 1) {
      if (items.head == find) true else false
    }

    else {
      val midPoint = dividePoint(items)
      val midElem = items.apply(midPoint)
      if (ordering.gt(find, midElem)) binarySearch(items.drop(midPoint), find)
      else if (ordering.gt(midElem, find)) binarySearch(items.take(midPoint), find)
      else true
    }
  }

  def dividePoint[T](items: List[T]): Int = {
    if (items.size % 2 == 0) items.size / 2 else items.size / 2 + 1
  }

  def main(args: Array[String]): Unit = {
    println(binarySearch(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 20, 34, 56, 345, 1245), 10))
    println(binarySearch(List("a", "b"), "b"))
    println(binarySearch(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 20, 34, 56, 345, 1245), 15))
  }
}