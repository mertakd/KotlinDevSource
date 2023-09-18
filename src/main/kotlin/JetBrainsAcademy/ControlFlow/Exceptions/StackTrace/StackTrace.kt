package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.StackTrace





import java.util.Scanner;

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    demo(input)
}

fun demo(input: String) {
    for (element in Thread.currentThread().stackTrace) {
        println(element)
    }
    val number = input.toInt() // an exception is possible here!
    println(number + 1)
}

