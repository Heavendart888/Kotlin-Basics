fun main(args: Array<String>) {
    //Primary Constructor
    // this part is more easier than the previous OOP
    val car1=Car("  Tesla    ","S Plaid","      Red   ",4)
    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Colour = ${car1.color}")
    println("Doors = ${car1.doors}")

    car1.move()
    car1.stop()
    println("\n")
    //another object
    var car2=Car("Fortuner","Rx540","Green",2)
    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Colour = ${car2.color}")
    println("Doors = ${car2.doors}")

    car2.move()
}

