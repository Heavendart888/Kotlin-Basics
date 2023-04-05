fun main(args: Array<String>) {
    val max = getMax(3, 100, 10)
    println(max)
    //default parameter
    sendMessage("Ram")
    sendMessage()
    sendMessage(message = "Bye Bye!")//Named parameter
    //vararg keyword functions

    println(sum(5, 6, 7, 10, 2, 3))

    //forEach
    sumdif(1, 4, 7, 8, 2, 3)
}

fun getMax(a: Int, b: Int) = if (a > b) a else b
fun getMax(a: Double, b: Double) = if (a > b) a else b
fun getMax(a: Int, b: Int, c: Int): Int {
    if (a >= b && a >= c) {
        return a
    } else if (b >= a && b >= c) {
        return b
    } else {
        return c
    }

}

//default Parameters in Functions
fun sendMessage(name: String = "user", message: String = sendText()) {
    println("Name=$name and message=$message")
}

fun sendText(): String {
    return "Some text!"
}

//vararg keyword functions
//vararg keyword helps us to reduce the number of declared variable.
fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}

//forEach
fun sumdif(vararg num: Int) {
    num.forEach { println(it) }
}