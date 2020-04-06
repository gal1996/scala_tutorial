object question10 {
  def main(args: Array[String]): Unit = {
    val l = List(List("hello", "world"), List("good", "morning"))
    println(l.flatMap(x => x))
    println(l.flatMap(_.mkString(" ")))
    val a = l.flatMap(_.mkString(" ").toUpperCase())
    println(a)

    val m = List("one", "two", "three")
    println(m.mkString(" "))
  }
}

// _.mkString(" ")でList("hello word")ができる。さらにtoUpperCaseでList("HELLO WORLD")となる
// これにより、出来上がるのは、List(List("HELLO WORLD"), List("GOOD MORNIG"))これがflattenされるのでList("H", "E", ...)と実行結果のようになる
