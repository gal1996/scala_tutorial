object question9 {
  def main(args: Array[String]): Unit = {
    val str = "hello.world"
    val ary: Array[String] = str.split('.')
    println(ary(0))
    println(ary(1))
  }
}
