fun main(args: Array<String>) {
    val user=User("Alex","Dobinica",23)
    val friend=User("John","Smith",30)
    println("Name :${user.name}")
}

class User(name:String,var lastName: String,var age:Int){
    var name:String
    //the code inside the init block is the first to be executed when the class is instantiated.
    init {
        if (name.lowercase().startsWith("a")){
            this.name=name //this line intialising name variable to name.
        }else{
            this.name="User"
            println("The name does'nt start with the letter 'a' or 'A'")
        }
    }
}