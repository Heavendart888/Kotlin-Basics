import javax.xml.crypto.Data

fun main(args: Array<String>) {
    //Singleton

    /* //This is the commented code part of the class
     val instance = Database.getInstance()
     val instance2 = Database.getInstance()
     println(instance)
     println(instance2)*/

    println(Database)
    println(Database)

}
/*    //This commented code is same as the code written inside object below but this code takes more memory than the object code.
class Database private constructor() {
}

companion object {
        private var instance: Database? = null

        //"private" keyword means the member is visible inside this class only.

        fun getInstance(): Database? {
            if (instance == null) {
                instance = Database()
            }

            return instance
        }
    }
}*/

object Database {
    init {
        println("Database created")
    }
}