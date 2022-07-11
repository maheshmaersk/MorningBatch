package kotlinsamples

class KtSample {
    
}

fun main() {
    var a = addTwoNum(3, 56)

    val b = 44
    a = a + 34

    getRanks(554)
    addMeToList("Harsha",546345,546545)
}

fun addTwoNum(a: Int, b: Int): Int {
    println(a + b)
    return a + b
}

fun getRanks(rank: Int) {
    when (rank) {
        in 1..10 -> println("Your in Top Ten Congrats")
        in 11..20 -> println("Your in Second List need to wait")
        in 33..60 -> println("You need to wait")
        else -> {
            println("You are rejected")
        }
    }
}


fun addMeToList(name: String, balance: Int,totalAmount :Int) {
  println("Hello $name,Your amount is debited with ${totalAmount-balance} Your balance is $balance")
}
