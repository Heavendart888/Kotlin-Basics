fun main(args: Array<String>) {
    //"Lateinit" keyword
    val user = User("Alex","Dobbin",23)

    user.favoriteMovie="Interstellar"
    //lateinit keyword can only be used inside classes and variable that is used as lateinit the values must be declared in future so that no exceptions occur and the apps works fine.
    println(user.favoriteMovie)

}

class User(var firstName: String, var lastName: String = "LastName", var age: Int = 0) {
   lateinit var favoriteMovie: String
   //lateinit keyword intializeses variable later.
}