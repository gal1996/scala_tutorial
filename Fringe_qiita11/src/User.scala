import scala.Option

class User(private val firstname: String, private val lastname: String)

object User {

  def unapply(user: User): Option[(String, String)] = Option((user.firstname, user.lastname))

  def main(args: Array[String]): Unit = {
    val user = new User("hoge", "kamiyado")

    user match {
      case User(firstname, lastname) => println(lastname + firstname)
      case _ => println("Not user")
    }
  }
}
