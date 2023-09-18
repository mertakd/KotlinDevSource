package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.TryCatchFinallyStatement


//Quiz 1
fun division() {

    var a = 0

    try {
        a = 44 / 0
        println("The try block is executed")
    }
    catch (e: NumberFormatException) {
        println("The catch block is executed")
    }
    finally {
        println("The finally block is executed")
    }
}

fun main1() {
    division()
}





//Quiz 2
fun main() {

    val answer: Int = try {
        readLine()!!.toInt()
    }catch (e:NumberFormatException){
        42
    }finally {
        println("The answer is a number")
    }
    println(answer)
}