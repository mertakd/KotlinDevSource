package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.LambdaWithReceiver

fun Int.isEven() = this % 2 == 0

fun main99() {

    println("Is 2 even?: ${2.isEven()}") // true
    println("Is 3 even?: ${3.isEven()}")  // false
}






//Working with lambdas with receivers
val sum: (Int, Int) -> Int = {a, b -> a + b}
fun main98() {
    println(sum(1, 2)) //3
}



val sum2: Int.(Int) -> Int = {a -> this + a}
fun main97() {
    println(sum2(1,2))
    println(1.sum2(2))
}




fun Int.opp(f: Int.() -> Int): Int = f()