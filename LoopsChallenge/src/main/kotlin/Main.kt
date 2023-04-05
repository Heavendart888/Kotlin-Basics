fun main(args: Array<String>) {
    var a:Int=0
    var c=0
    for (i in 1..20){
        if(i%2==0){
            println("even: $i\n")
            a+=i
            c+=1
        }else{
            println("odd : $i\n")
        }
    }
    println("Total Even Number sum= $a")
    println("Total Even number are= $c")
}
