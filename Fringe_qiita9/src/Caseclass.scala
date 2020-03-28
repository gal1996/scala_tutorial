object Caseclass {
  def main(args: Array[String]): Unit = {
    val domain1 = new Domain3(1, "hoge")
    val domain2 = domain1


    println(domain1 == domain2)
    println(domain1 != domain2)

    val domain3 = new Domain3(2, "huga")

    println(domain1 == domain3)
    println(domain1 != domain3)
  }
  case class Domain3(val id: Long, val name: String)
}

