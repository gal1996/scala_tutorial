object question7 {
  def main(args: Array[String]): Unit = {
    val l = List("zero", "one", "two")

    val m = l.zipWithIndex.map{_.swap}.toMap
    println(m)
  }
}
