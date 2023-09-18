package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.LambdaWithReceiver

// Quiz 1
val isDivisible1a: Int.(Int) -> Boolean = { other ->
    this % other == 0
}
val isDivisible1b: Int.(Int) -> Boolean = { this % it == 0 }

fun main1a() {
    val (a, b) = readln().split(' ').map { it.toInt() }
    println(a.isDivisible1a(b))
}





//Quiz 2
fun Int.opp2(f: Int.() -> Int): Int = f()
fun main2() {
    val res = 10.opp2{this % 2}
    println(res)
}






// Quiz 3
fun String.magic(init: String.() -> String): String{
    return this.init()
}
fun main() {
    val str = readLine()!!
    val res = str.magic {
        uppercase().reversed().dropLast(1)
    }
    println(res)
}