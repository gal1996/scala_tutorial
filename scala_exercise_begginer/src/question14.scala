object question14 {
  def foo(n: Int, count:Int): Int = {
    if (count == 0) {
      0
    } else {
      n + foo(n, count-1)
    }
  }

  def main(args: Array[String]): Unit = {
    println(foo(10, 3))
    println(foo(5, 4))
  }
}
