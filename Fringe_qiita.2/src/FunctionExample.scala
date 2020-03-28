object FunctionExample {
  def main(args: Array[String]): Unit ={

    var calculate = (x: Int) => x + 5 : Int

    printf("y=%s", calculate(1))
    printf("y=%s", calculate(2))
  }
}
