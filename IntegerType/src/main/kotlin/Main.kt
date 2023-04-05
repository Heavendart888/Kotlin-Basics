fun main() {
    var number=23
    //Integer
    val integerMaxValue=Int.MAX_VALUE
    val integerMinValue=Int.MIN_VALUE
    println("Integer Max value: $integerMaxValue")
    println("Integer Min value: $integerMinValue")

    number=2147483647
    //byte
    val byteMaxValue:Byte=Byte.MAX_VALUE
    val byteMinValue:Byte=Byte.MIN_VALUE
    println("Byte Max value: $byteMaxValue")
    println("Byte Min value: $byteMinValue")

    //Short
    val shortMaxValue:Short=Short.MAX_VALUE
    val shortMinValue:Short=Short.MIN_VALUE
    println("Short Max value: $shortMaxValue")
    println("Short Min value: $shortMinValue")


    //Long

    val longMaxValue:Long=Long.MAX_VALUE
    val longMinValue:Long=Long.MIN_VALUE
    println("Long Max value: $longMaxValue")
    println("Long Min value: $longMinValue")

    //put capital "L" at last of any number so that the cariable will be declared as an Long datatype.
    val myNumber=28L
}