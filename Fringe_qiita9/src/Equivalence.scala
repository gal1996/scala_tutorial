object Equivalence {
  def main(args: Array[String]): Unit = {
    val domain1 = new Domain1(1, "hoge")
    val domain2 = new Domain1(1, "hoge")

    println(domain1 == domain2)
    println(domain1 != domain2)

    val domain3 = new Domain1(2, "huga")

    println(domain1 == domain3)
    println(domain1 != domain3)
  }
}

class Domain1(val id: Long, val name: String) {
  def canEqual(other: Any) = {
    other.isInstanceOf[Domain1]
  }

  override def equals(other: Any) = {
    other match {
      case that: Domain1 =>
        that.canEqual(Domain1.this) && id == that.id && name == that.name
    }
  }

  override def hashCode() = {
    val prime = 41
    prime * (prime + id.hashCode) + name.hashCode
  }
}
