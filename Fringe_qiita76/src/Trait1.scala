object Trait1 {
  def main(args: Array[String]): Unit = {
    val man = new Man
    man.sayName()
  }
}

trait Human {
  val name = "hoge"

  def sayName(): Unit = {
    println("My name is " + name)
  }
}

class Man extends Human

