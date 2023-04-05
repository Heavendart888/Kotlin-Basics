fun main() {
    val x =5
    val y =3F

    val result=x+y // x and y are operands and + is operator
    println("result=$result")

    println("x+y= ${x+y}") //statement inside curly braces is known as expression
    println("x-y= ${x-y}")
    println("x*y= ${x*y}")
    println("x/y= ${x/y}")
    println("x%y= ${x%y}")

    println("3+3*4= ${3+3*4}") //precedence you ca control precedence also by using bracket across number which you want to operate first

    var new=x+y
    new+=2
    println("Result= $new")

    var a=0
    println("Incrementation = ${a++}") //this is postfix expression
    println("value of a $a")
    println("Decrementation = ${--a}")//this is prefix expression

    //Comments- Statement that is ignored by compiler
    //This is single line comment
    /* this is multi
    line comment*/



}

