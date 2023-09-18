package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.TryCatchStatement

fun main1() {

    println("Before the try-catch block") // it will be printed
    try {
        println("Inside the try block before an exception") // it will be printed
        println(2 / 0) // it throws ArithmeticException
        println("Inside the try block after the exception") // it won't be printed
    } catch (e: ArithmeticException) {
        println("Division by zero!") // it will be printed
    }

    println("After the try-catch block") // it will be printed
}


fun main2() {

    try {
        val d = (2 / 0).toDouble()
    } catch (e: Exception) {
        println(e.message)
    }

}