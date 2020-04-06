import scala.collection.MapOps

object question6 {
  def main(args: Array[String]): Unit = {
    val l = List(1,2,3,4,5)
    val (odds, evens) = l.partition(x => x % 2 == 0)
    println(odds)
    println(evens)
  }
}

