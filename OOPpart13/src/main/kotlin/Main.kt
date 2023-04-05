//Challenge Questions
//"this" keyword allow us to refer to the instance of class whose function we happen to be running.
fun main(){
    val alexAccount=Account("Alex")
    alexAccount.deposit(1000)
    alexAccount.widraw(500)
    alexAccount.deposit(-20)
    alexAccount.widraw(-100)

    val balance=alexAccount.calulateBalance()
    println("Balance is $balance")

}

class Account(val accountName:String){
    private var balance=0
    private var transactions= mutableListOf<Int>()

    fun deposit(amount:Int){
        if (amount>0){
            transactions.add(amount)
            balance+=amount
            println("$amount deposited . Balance is now ${this.balance}")
        }else{
            println("Cannot deposit negative sums")
        }
    }

    fun widraw(withdrawl:Int){
        if (-withdrawl<0){
            transactions.add(-withdrawl)
            this.balance+= -withdrawl
            println("$withdrawl withdrawn. Balance is now ${this.balance}")
        }else{
            println("Cannot withdraw negative sums")
        }
    }

    fun calulateBalance():Int{
        this.balance=0
        for (transaction in transactions){
            this.balance+=transaction
        }
        return this.balance
    }
}