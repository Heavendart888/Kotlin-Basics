fun main(args: Array<String>) {
    //labels is used to stop the outer loop
    println("Labels")
    var num3 = 0
    outer@ while (num3 < 10) {
        num3++
        println(num3)
        var i = 0
        while (i < 5) {
            if (i==0){break@outer}
            //"@outer" keyword breaks outer loop.But we cannot target inner loop by outer loop.
            i++
            println("***$i")
        }
    }

}