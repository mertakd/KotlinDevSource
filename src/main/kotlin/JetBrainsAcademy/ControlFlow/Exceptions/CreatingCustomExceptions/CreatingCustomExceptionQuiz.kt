package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.CreatingCustomExceptions

// Quiz 1
//open class CorrectNumberException: RuntimeException()
//open class NumberOutOfRange: CorrectNumberException()
//class NumberBelowRange: NumberOutOfRange()



// Quiz 2
class ValueIsNegative: Exception()
class ValueIsNegative2 : Exception {
    constructor() : super()
    constructor(message: String?) : super(message)
}





// Quiz 3
/*
fun main() {
    try {
        aToZ()
    } catch (e: InvalidInput) {
        println(e.message)
    }
}
*/





//Quiz 4
//class MyCustomException(): Exception("Error message")
//class MyCustomException(): Exception()
//open class MyCustomException(): Exception("Error message")