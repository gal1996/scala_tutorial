object question2 {
  def main(args: Array[String]): Unit = {
    val opt1: Option[String] = Some("hello")
    println(getFirstChar(opt1))
    println(getFirstChar2(opt1))

    val opt2: Option[String] = Some("")
    println(getFirstChar(opt2))
    println(getFirstChar2(opt2))
    val opt3: Option[String] = None
    println(getFirstChar(opt3))
    println(getFirstChar2(opt3))
  }

  // 作りたいのはOption("h")
  def getFirstChar(message: Option[String]): String =  {
    message.map(_.take(1)).getOrElse("")
  }

  def getFirstChar2(message: Option[String]): String = {
    message.fold(""){m => m.take(1)}
  }
}
