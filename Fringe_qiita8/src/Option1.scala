object Option1 {
  def main(args: Array[String]): Unit = {
    val map = Map(1 -> "Moses", 2 -> "Lucas", 3 -> "Handerson")

    def check(o: Option[String]): Unit = {
      o match {
        case Some(s) => println(s)
      }
    }

    val some = map get(2)
    val none = map get(4)

    check(some)
    check(none)
  }
}
