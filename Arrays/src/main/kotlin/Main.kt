fun main(args: Array<String>) {
    val names =  arrayOf("John","Stephen","Megan")
    val mixedElements = arrayOf(4,5,6,7,3,"Name 1",'a')

    names[0]="Alex"
    println("First element: ${names[0]}")
    println("The size of the array is: ${names.size}")

    for(name in names){
        println(name)
    }
    //next Concept
    println("Next Concept \n")
    for (i in mixedElements){
        if (i is String){
            println(i)
        }
    }
}