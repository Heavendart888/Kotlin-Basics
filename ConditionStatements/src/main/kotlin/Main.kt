fun main() {
    //"==" is an comparision operator and "=" is assignment operator
    //there is more operators also like >=,<=,etc.
    val isActive = false
    if (isActive == true) {
        println("The condition is true.")
    } else {
        println("The condition is False.")
    }
    //else if
    val a = 7
    if (a > 7) {
        println("The number is greter than 7")
    } else if (a >= 6) {
        println("The number is greter than 6")
    } else {
        println("The condition is False.")
    }
// "!=" this operator compares that two numbers are not equal.

    val b = false
    if (!isActive) {
        println("The user is active")
    } else {
        println("The user is not active")
    }
    //Logical AND operator
    val isPlaying = true
    val score = 100
    if (isPlaying && score == 100) {
        println("Next Level Opened")
    } else {
        println("Still at the same level")
    }
    //Logical OR Operator
    //this is "||" OR Operator.
    val num1 = 5
    val num2 = 4
    val text = if (num1 > 0 || num2 > 0) {
        println("The condition is True")
    } else {
        println("The condition is false")
    }
    //another concept
    val num3 = -5
    val num4 = -4
    //The last expression in the curly braces is assigned as a value to our variable.
    val tex = if (num3 > 0 || num4 > 0) {
        println("The condition is True")
        "This is text 1"
    } else {
        println("The condition is false")
        "This is text 2"
    }
    println("$tex")

    //When Statement
    val alarm = 9
    val luck = when (alarm) {
        12, 7, 14 -> println("The time is $alarm")
        in 1..10 -> println("The number is in the range 1..10") //this statement is used for range condition only.
        else -> println("The time is $alarm")//use curly braces if you have to print multiple lines
    }
    println("$luck")
}