object question1 {
  def main(args: Array[String]): Unit = {
    val opt1: Option[String] = Some("hello")
    show(opt1)

    val opt2: Option[String] = None
    show(opt2)
  }

  def show(message: Option[String]): Unit = {
    message.foreach(println)
  }
}
