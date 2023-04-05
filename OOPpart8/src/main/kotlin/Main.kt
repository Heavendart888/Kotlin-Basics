fun main(args: Array<String>) {
    //Companion Object
    val result=Calculator.sum(5,10)

    println(result)
}

class Calculator() {
    companion object{
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }

}

