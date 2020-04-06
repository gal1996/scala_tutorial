import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

object question16_2 {
  def main(args: Array[String]): Unit = {
    val start = System.currentTimeMillis()

    val f = for {
      v <- Future{Thread.sleep(2000); 1}.zip(Future{Thread.sleep(4000); 2})

    } yield v._1 + v._2

    Await.result(f, Duration.Inf)
    val end = System.currentTimeMillis()
    println(f)
    println("実行時間:" + (end-start) + "ms")
  }
}

// for式の中では処理が直列化されてしまうので、Futureはfor式の外に記述する必要がある
