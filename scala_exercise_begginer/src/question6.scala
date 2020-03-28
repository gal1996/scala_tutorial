object question6 {
  def main(args: Array[String]): Unit = {
    val l = List(1,2,3,4,5)
    var odds = List[Int]()
    var evens = List[Int]()

    odds = l.filter(_%2 == 0)
    evens = l.filter(_%2 == 1)
    println(odds)
    println(evens)
  }
}
