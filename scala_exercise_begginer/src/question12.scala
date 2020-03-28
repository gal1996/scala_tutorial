object question12 {
  def foo(n: Int): Int = {
    println(s"input = $n")
    val r = n * 3
    println(s"result = $r")

    r
  }

  def bar(s: String): String = {
    println(s"input = $s")
    val r = s * 2
    println(s"result = $r")

    r
  }

  def fuga[A](v: A, times: Int): Any = {
    println(s"input = $v")
    val r = v * times
    println(s"result = $r")

    r
  }

  def main(args: Array[String]): Unit = {
    foo(2)
    bar("hoge")
  }
}
