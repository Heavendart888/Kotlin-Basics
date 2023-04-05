fun main(args: Array<String>) {
    //Getter and Setters


    val user = User("Alex")
    val friend = User(firstName = "John", lastName = "Smith")
    val user2 = User(age = 19, firstName = "Iona", lastName = "Dobbi")

    //Encapsulation basically means to protect ,to hide the inner workings of the class from being accessed outside.
    //"getter" is used to get the value and "setters" is used to change the values in a property.

    user.firstName = "Vlan"

    println(user.firstName)
    println(user.lastName)
    println(user.age)

    println("\n")

    println(friend.firstName)
    println(friend.lastName)
    println(friend.age)

}

class User(firstName: String, var lastName: String = "LastName", var age: Int = 0) {
    var firstName = firstName
    //getter and setter are auto generated always by kotlin so we do not have to declare the below code everytime.

        get() {
            return "FirstName: $field"
        }
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }
}