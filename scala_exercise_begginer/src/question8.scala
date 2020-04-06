object question8 {
  def main(args: Array[String]): Unit = {
    val scores = Map(
      "ichiro" -> Map("math"->82, "english"->99),
      "jiro" -> Map("japanese"->100, "social"->88),
      "saburo" -> Map("math"->76, "english"->80),
      "shiro" -> Map("math" -> 99, "social" -> 81),
      "hanako" -> Map("math"->84, "english"->78, "social"->66))

    for{
      v <- scores
      m <- v._2.get("math")
      e <- v._2.get("english")
    } {
      println(Map(v._1 -> (m+e)/2))
    }
  }
}
