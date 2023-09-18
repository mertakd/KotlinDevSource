package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.TamingExceptions


// Quiz 1
fun doComputations(value: Int) {
    if (value / 2 == 1) {
        throw Exception("Divided by 2!")
    } else if (value + 2 / 2 == 1) {
        throw Exception("Some computations here")
    } else {
        throw Exception("No computations")
    }
}

fun main1() {
    doComputations(5)
}




// Quiz 2
fun main() {

    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()

    if (b == 0.0){
        println("Division by zero, please fix the second argument!")
    }else{
        val result = (a / b).toInt()
        println(result)
    }
}