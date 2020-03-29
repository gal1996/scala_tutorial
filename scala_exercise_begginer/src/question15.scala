import scala.concurrent.duration.Duration
import scala.util.{Failure, Success, Try}
import scala.concurrent._
import ExecutionContext.Implicits.global


object question15 {
  def firstOf[A](v1: Future[A], v2: Future[A]): Future[A] = {
    val p1 = Promise[A]()
    p1 completeWith v1
    p1.future onComplete {
      case Success(v) => v
      case Failure(t) => t
    }
    p1 completeWith v2
    p1.future onComplete {
      case Success(v) => v
      case Failure(t) => t
    }

    p1.future
   }

  def main(args: Array[String]): Unit = {
    val r1 = firstOf(Future{ Thread.sleep(9000); 1}, Future { Thread.sleep(3000); 2})
    println(Await.result(r1, Duration.Inf))

    val r2 = firstOf(Future{ Thread.sleep(900); 1 }, Future.failed(new Exception))
    Thread.sleep(100)
    println(r2.value.get.isFailure) // trueが返る
  }
}
