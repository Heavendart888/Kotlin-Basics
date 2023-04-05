fun main(args: Array<String>) {
    //for loop
    for (i in 1..10) {
        println("i=$i")
    }
    //to loop forward
    for (j in 1 until 10) {
        println(j)
    }
    //to loop backward
    for (k in 10 downTo 1) {
        println("k=$k")
    }

    for (p in 1 until 10 step 2) {
        println("p=$p")
    }
    //while loop
    var number = 0
    while (number < 10) {
        println(number)
        number++
    }
    //do while loop
    var num = 10
    do {
        println(num)
    } while (num < 10)

    //Continue keyword
    println("Continue keyword")
    var num1 = 0
    while (num1 < 10) {
        num1++
        if (num1 == 7) {
            continue
        }
        println(num1)
    }
    //break keyword and loop inside an another loop.
    println("Break Keyword")
    var num2 = 0
    while (num2 < 10) {
        num2++
        if (num2 == 7) {
            break
        }
        println(num2)


        var i = 0
        while (i < 5) {
            i++
            println("***$i")
        }
    }

}