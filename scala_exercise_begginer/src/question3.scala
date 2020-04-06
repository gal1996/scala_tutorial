object question3 {
 def main(array: Array[String]): Unit = {

  println(NumEnglishDictionary.translate(Some(1)))
  println(NumEnglishDictionary.translate(Some(3)))
  println(NumEnglishDictionary.translate(None))

 }
}

object NumEnglishDictionary {
 private val dictionary = Map(1->"one", 2->"two")

  // これは、mapだと通らない。mapは型がA => Bの関数を受け取るので、関数内でNoneを返すような処理があると実行時にエラーになってしまう
  // flatMapだと受け取る関数の型がA => Option(B)なのでNoneが帰る場合でも問題ない
  // という理解はあってますか？？
 def translate(num: Option[Int]): Option[String] = {
   // 通らない
   // num.map({n => dictionary(n)})
   // 通る
   num.flatMap(n => dictionary get (n))
 }
}
