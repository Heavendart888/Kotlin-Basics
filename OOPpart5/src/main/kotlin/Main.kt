fun main(args: Array<String>) {
    //Default Values for Constructor Parameter


    val user=User("Alex")
    val friend=User(firstName = "John", lastName = "Smith")
    val user2=User(age=19, firstName = "Iona", lastName = "Dobbi")



    println("Name=${user.firstName}")
    println("Name=${user.lastName}")
    println("Name=${user.age}")

    println("\n")

    println("Name=${friend.firstName}")
    println("Name=${friend.lastName}")
    println("Name=${friend.age}")

}

class User(var firstName:String, var lastName: String="LastName", var age:Int=0){

}