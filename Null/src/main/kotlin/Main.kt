fun main(args: Array<String>) {
    val text:String? = "Name" //"?" at the end allows you to make an variable nullable
    if (text != null){
        println(text.length)
    }else{
        println("The variable is null.")
    }
    // above is an longcut way to check variable is null or not.
    //below one is shortcut way to check variable is null or not.
    var tex:String? = null
        println(tex?.length)
    tex="Some text"
        println(tex!!.length)//"!!." this throws exceptions.

    //elvis operator
    var tes:String?=null
    tes="This variable is not null."
    val text2 : String=tes ?: "The variable is null."
    println(text2)


}