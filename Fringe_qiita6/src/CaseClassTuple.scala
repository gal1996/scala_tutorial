object CaseClassTuple {
  def get() = {
    val name = new Name("hoge", "huga")
    (Human(name, 15), name)
  }

  def main(args: Array[String]): Unit = {
    val tuple = get()
    printf("%s \n", tuple._1.name.fullname)
    printf("%s \n", tuple._2.fullname)
  }
}

class Name(first: String, last: String) {
  def fullname() = first + " " + last
}

case class Human(name: Name, age: Int)
