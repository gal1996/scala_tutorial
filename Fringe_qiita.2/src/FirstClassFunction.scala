object FirstClassFunction {
  def main(args: Array[String]): Unit = {
    val add = (x: Int) => {
      val _add = (y: Int) => y + 5
      _add(x)
    }

    printf("add=%s \n", add(1))
    printf("add=%s \n", add(2))
    printf("add=%s \n", add(1))
  }
}
