fun main(args: Array<String>) {
    sayHello(name = "Ram", 22)
    sayHello(name = "Shyam", 25)

    val hasInternetConnection = true
    if (hasInternetConnection) {
        getData("Some data")
    } else {
        showMessage()
    }

    val max = getMax(5, 9)
    println(max)

}

fun sayHello(name: String, age: Int) {
    var number =
        age //"number","age","name" are all local scope variable hence it cannot be accssed outside of curly brace.
    println("Hello, $name Your age is $age")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("There is no internet connection.")
}

fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    print("Some text thats executed before return\n")
    return max
    print("Some text that's not executed after return")
    //two return cannot be used at once in a same statement.we can only use two return in two diffrent statements.
}