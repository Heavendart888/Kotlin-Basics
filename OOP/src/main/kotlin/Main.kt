fun main(args: Array<String>) {
    val car1=Car()
    car1.name="Tesla"
    car1.model="S Plaid"
    car1.color="Red"
    car1.doors=4

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Colour = ${car1.color}")
    println("Doors = ${car1.doors}")

    car1.move()
    car1.stop()
    println("\n")
    //another object
    var car2=Car()
    car2.name="Fortuner"
    car2.color="Green"
    car2.model="Rx40"
    car2.doors=2

    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Colour = ${car2.color}")
    println("Doors = ${car2.doors}")

    car2.move()
}

class Car {
    var name=""
    var model=""
    var color=""
    var doors=0

    fun move(){
        println("The car $name is moving")
    }
    fun stop(){
        println("The car $name has stopped")
    }
}