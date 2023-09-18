package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.CatchingSupertype

// Quiz 1
fun main1() {

    try {
        val numerator = readLine()!!.toInt()
        val denominator = readLine()!!.toInt()

        if (denominator == 0){
            println("Cannot divide by zero!")
        }else{
            val result = numerator / denominator
            println(result)
        }
    }catch (e:NumberFormatException){
        println("Numerator and denominator must be valid integers.")
    }
}





//Quiz 2
fun main2() {
    val input = readLine()
    try {
        println(100 / input!!.toInt())
    } catch (e: ArithmeticException) {
        println("You cannot divide by zero!")
    } catch (e: NumberFormatException) {
        println("You did not enter a valid integer!")
    } catch (e: Exception) {
        println("An unknown error has occurred!")
    }
}




// qUİZ 3
open class BaseException : Exception()
open class MidException : BaseException()
class DerivedException : MidException()

fun main3() {
    val exceptionList = listOf(DerivedException(), MidException(), BaseException())
    for (ex in exceptionList) {
        try {
            throw ex
        } catch (e: DerivedException) {
            println("Caught a DerivedException!")
        } catch (e: MidException) {
            println("Caught a MidException!")
        } catch (e: BaseException) {
            println("Caught a BaseException!")
        }
    }
}







// qUİZ 4
fun main4() {
    val input = readlnOrNull()
    try {
        val number = input?.toInt() ?: throw NumberFormatException()
        if (number < 0) {
            throw IllegalArgumentException("The number must be non-negative.")
        }
        val square = number * number
        println(square)
    } catch (e: NumberFormatException) {
        println("The input must be a valid integer.")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    } catch (e: Exception) {
        println("Unknown error has happened!")
    }
}





// Quiz 5
fun main() {
    val input = readln()
    try {
        val list = input.split(",")
        if (list.isEmpty() || list.all { it.isBlank() }) {
            throw IllegalArgumentException("Cannot calculate average of an empty list!")
        }
        val numbers = list.map { it.toInt() }
        val average = numbers.average()
        println(average)
    } catch (e: NumberFormatException) {
        println("Invalid input!")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    } catch (e: Exception) {
        println("An error occurred!")
    }
}




