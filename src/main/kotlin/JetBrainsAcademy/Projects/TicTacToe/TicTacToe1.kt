package JetBrainsAcademy.Projects.TicTacToe

import kotlin.random.Random

//answer1
fun main1() {
    println("XOX")
    println("OXO")
    println("XXO")


    println("""
        X O X
        O X O
        X X O 
    """.trimIndent()
    )
}



fun main() {
    battleField()
}

fun battleField() {
    val field = List(3) {
        Array(3) {
            if (Random.nextBoolean()) "X" else "O"
        }
    }
    for (i in field.indices)
        println(field[i].joinToString(" "))
}


