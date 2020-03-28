object User {
  class User(val id: Long, val firstname: String, val lastname: String, val fullname: Fullname = new Fullname) {
    def getFullname() = this.fullname.get(firstname, lastname)
  }

  class Fullname() {
    def get(firstname: String, lastname: String) = firstname + " " + lastname
  }

  class FullnameInJapan() extends Fullname {
    override def get(firstname: String, lastname: String): String = lastname + " " + firstname
  }

  def main(args: Array[String]): Unit ={
    val user1 = new User(1, "hoge", "huge", new FullnameInJapan)
    println(user1.getFullname())

    val user2 = new User(2, "aho", "baka")
    println(user2.getFullname())
  }
}
