fun main() {
    //abstract class
    val name = Name()
    name.printName()
    val child=Child()
    child.run()
    //we cannot use abstract class instance on this main function.
}

class Child : Parent() {
    override fun run() {
        println("I am running")
    }

}

open abstract class Parent {
    abstract fun run()
    fun eat() {
        println("I am eating")
    }
}

class Name {
    fun printName() {
        println("Kotlin")
    }
}