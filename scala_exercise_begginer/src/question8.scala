object question8 {
  def main(args: Array[String]): Unit = {
    val scores = Map(
      "ichiro" -> Map("math"->82, "english"->99),
      "jiro" -> Map("japanese"->100, "social"->88),
      "saburo" -> Map("math"->76, "english"->80),
      "shiro" -> Map("math" -> 99, "social" -> 81),
      "hanako" -> Map("math"->84, "english"->78, "social"->66))

    scores.foreach({ i =>
      (i._2.contains("math") && i._2.contains("english")) match {
        case true => {
          println(Map(i._1 -> (i._2("math") + i._2("english"))/2))
        }
        case false =>
      }
    })
  }
}
