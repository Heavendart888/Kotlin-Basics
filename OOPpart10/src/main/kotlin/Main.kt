fun main(args: Array<String>) {
    //Lazy Initialization
    val user1=User("Alex","Dobbin",23)
    val user2 by lazy { //this line is known as lazy Initialization.
        User("User1","lastName",0)
    }

    println(user2.firstName)
}

class User(var firstName:String, var lastName: String="LastName", var age:Int){
    init {
        println("User: $firstName was created")
    }
}