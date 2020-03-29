object question12 {
  def foo(n: Int): Int = {
    fuga[Int](n, p => p * 3)
  }

  def bar(s: String): String = {
    fuga[String](s, p => p * 2)
  }

  def fuga[A](v: A, calcfunc: A => A): A = {
    println(s"input = $v")
    val r = calcfunc(v)
    println(s"result = $r")

    r
  }

  def main(args: Array[String]): Unit = {
    foo(2)
    bar("hoge")
  }
}
