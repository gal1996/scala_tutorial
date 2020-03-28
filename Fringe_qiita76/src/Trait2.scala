object Trait2 {
  def main(args: Array[String]): Unit = {
    val man = new Man2("hoge", "huga", "fuga")
    man.say()
  }
}

trait Human2 {
  val name: String
}

trait Job {
  val job: String
}

trait Grade {
  val grade: String
}

class Man2(n: String, j: String, g: String) extends Human2 with Job with Grade {
  val name = n
  val job = j
  val grade = g

  def say(): Unit = {
    println("名前は" + this.name + "じゃ" + this.job + grade + "じゃ")
  }
}
