object questionX {
  def main(args: Array[String]): Unit = {
    val o1: Option[String] = Option(null)
    //val o2: Option[Int] = Option(null)
  }
}

// Stringは参照型であるAnyRef型を継承しているため、nullが使えるが、AnyValを継承しているIntはnullが非許容なため