object question13 {
  def main(args: Array[String]): Unit = {
    val u = User.apply("yugo", 23)
    println(u)
  }
}

class User private (val name: String, val age: Int) {

}

object User {
  def apply(name: String, age: Int) = new User(name, age)
}
