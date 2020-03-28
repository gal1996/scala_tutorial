object question7 {
  def main(args: Array[String]): Unit = {
    val l = List("zero", "one", "two")
    var m = Map[Int, String]()

    l.zipWithIndex.map{ case (item, index) => m = m + (index -> item)}
    println(m)
  }
}
