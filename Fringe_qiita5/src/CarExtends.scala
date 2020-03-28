object CarExtends {
  def main(args: Array[String]): Unit = {
    var car = new Car("blue")
    output(car)
    car.run

    var truck = new Truck("red")
    output(truck)
    truck.run
  }

  def output(car: Car):Unit = println("Color is " + car.color + ".")
}

class Car(val color: String) {
  def run = println("Start")
}

class Truck(color: String) extends Car(color){
  override def run = println("Truck Start")
}


