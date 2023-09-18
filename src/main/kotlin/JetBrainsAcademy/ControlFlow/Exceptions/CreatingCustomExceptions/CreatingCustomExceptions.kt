package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.CreatingCustomExceptions

fun testFunction(a: Int, b: Int): Int {
    return a / b
}

fun main99() {
    try {
        testFunction(1, 0)
    } catch (e: Exception) {
        throw Exception("testFunction() failed", e)
    }
}





//Creating custom Exceptions
//Kendi istisna sınıflarımızı, Exception sınıfının yalnızca alt sınıfları olarak oluşturabiliriz
class LessThanZero: Exception("Parameter less than zero")

class GreaterThanTen: Exception("Parameter greater than ten")


fun myFunction(par: Int) {
    if (par < 0) throw LessThanZero()
    else if (par > 10) throw GreaterThanTen()

}

fun main98() {
    myFunction(-3)
}










//Catching custom Exceptions
class BetweenOneAndFive: Exception("Value between 1 and 5")
class BetweenSixAndTen: Exception("Value between 6 and 10")

fun myFunction() {
    val randomInteger = (1..10).shuffled().first()  // Get a random integer between 1 and 10
    if (randomInteger <= 5) throw BetweenOneAndFive()
    else throw BetweenSixAndTen()
}

fun main95() {
    try {
        myFunction()
    } catch (e: BetweenOneAndFive) {
        println("BetweenOneAndFive was thrown")
    } catch (e: BetweenSixAndTen) {
        println("BetweenSixAndTen was thrown")
    }
}








//Multiple constructors
class MyCustomException: Exception {
    constructor() : super()  // No parameters
    constructor(message: String?) : super(message)  // Only the String parameter
    constructor(message: String?, cause: Throwable?) : super(message, cause) // Both parameters
    constructor(cause: Throwable?) : super(cause)  // Only the exception parameter




}


fun main() {
    throw MyCustomException()

    throw MyCustomException("My exception message")

   // throw MyCustomException("My exception message", otherException)

    //throw MyCustomException(otherException)
}



class MyArithmeticException: ArithmeticException {
    constructor() : super()
    constructor(message: String?) : super(message)
}