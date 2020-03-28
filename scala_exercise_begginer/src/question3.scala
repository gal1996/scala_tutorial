object question3 {
 def main(array: Array[String]): Unit = {

  println(NumEnglishDictionary.translate(Some(1)))
  println(NumEnglishDictionary.translate(Some(3)))
  println(NumEnglishDictionary.translate(None))

 }
}

object NumEnglishDictionary {
 private val dictionary = Map(1->"one", 2->"two")

 def translate(num: Option[Int]): Option[String] = {
  num match {
   case Some(v) => dictionary get (v)
   case None => None
  }
 }
}
