object question4 {
  def main(args: Array[String]): Unit = {
    val m = Map(1->"one", 2->"two")
    val mOpt: Option[Map[Int, String]] = Some(m)

    println(mOpt.get(1))
    println(m(1)) // mOpt.get(1)と同じこと
    println(m.apply(1))
    println(mOpt.get get(1)) // Optionでくるみたければ、こう書く
  }
}

// 解答
// mOtpはOpton型なので引数のないgetメソッドを持っている。
// なのでmOpt.get(1)とした場合、まず、mOpt.getでMap[Int, String]のmapが返ってくる
// それに対して(1)が評価されるので、処理自体としては、m(1)が評価されたのと同じ結果が得られる
// なので、mapのgetをしてoptionに包まれて返ってくるのはmOpt.get get(1)とすることで得られる