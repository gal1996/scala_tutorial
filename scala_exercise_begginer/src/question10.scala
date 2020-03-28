object question10 {
  def main(args: Array[String]): Unit = {
    val l = List(List("hello", "world"), List("good", "morning"))
    val a = l.flatMap(_.mkString(" ").toUpperCase())
    println(a)
  }
}

// _.mkString(" ")でList("hello word")ができる。さらにtoUpperCaseでList("HELLO WORLD")となる
// これにより、出来上がるのは、List(List("HELLO WORLD"), List("GOOD MORNIG"))これがflattenされるのでList("H", "E", ...)と実行結果のようになる
