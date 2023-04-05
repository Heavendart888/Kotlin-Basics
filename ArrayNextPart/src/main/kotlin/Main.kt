fun main(args: Array<String>) {
    var g = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 53)
    var b = max(g)
    println("Max number: $b")
    var f = min(g)
    println("Min number: $f")
}

fun max(a: Array<Int>): Int {
    var c = a.max()
    return c
}

fun min(d: Array<Int>): Int {
    var e = d.min()
    return e
}