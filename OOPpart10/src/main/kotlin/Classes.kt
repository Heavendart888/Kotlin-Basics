class Car(var name: String, var model:String, color:String, doors:Int) {
    var color=color.trim()
    var doors=doors

    fun move(){
        println("The car $name is moving")
    }
    fun stop(){
        println("The car $name has stopped")
    }
}


class Calculator() {
    companion object{
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }


object Database {
    init {
        println("Database created")
    }
}
}