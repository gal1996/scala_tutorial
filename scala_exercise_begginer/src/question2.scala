object question2 {
  def main(args: Array[String]): Unit = {
    val opt1: Option[String] = Some("hello")
    println(getFirstChar(opt1))

    val opt2: Option[String] = Some("")
    println(getFirstChar(opt2))

    val opt3: Option[String] = None
    println(getFirstChar(opt3))
  }

  def getFirstChar(message: Option[String]): String =  {
    message.getOrElse("").take(1)
  }
}
