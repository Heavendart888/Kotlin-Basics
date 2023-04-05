fun main(args: Array<String>) {
    //Secondary Constructor

    val user=User("Alex")
    val friend=User("John","Smith")
    println("Name=${user.name}")
    println("Name=${user.lastName}")
    println("Name=${user.age}")

    println("\n")

    println("Name=${friend.name}")
    println("Name=${friend.lastName}")
    println("Name=${friend.age}")

}

class User(var name:String,var lastName: String,var age:Int){
    constructor(name:String): this(name,"LastName",0) {
        println("2nd")
    }
    //Above line=Right hand side of the colon is the primary constructor and the left hand side of the colon is the secondary constructor.
    //primary constructor can only have properties.

    constructor(name:String,lastName: String): this(name,lastName,0){println("3rd")}
}