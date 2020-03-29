import com.sun.jdi.event.AccessWatchpointEvent

import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.util.Success

object question16 {
  def main(args: Array[String]): Unit = {
    val start = System.currentTimeMillis()

    val A = Future {
      Thread.sleep(2000)
      1
    }

    val B = Future {
     Thread.sleep(4000)
     2
    }

    val f = for {
      a <- A

      b <- B
    } yield a + b

    Await.result(f, Duration.Inf)
    val end = System.currentTimeMillis()
    println(f)
    println("実行時間:" + (end-start) + "ms")
  }
}

// for式の中では処理が直列化されてしまうので、Futureはfor式の外に記述する必要がある
