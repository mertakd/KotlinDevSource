package JetBrainsAcademy.ControlStructures.WhenExpression

import java.util.*


// Quiz 1
fun main1a() {

    val units = readln().toIntOrNull()

    val category = when (units){
        in Int.MIN_VALUE..0 -> "no army"
        in 1..4 -> "few"
        in 5..9 -> "several"
        in 10..19 -> "pack"
        in 20..49 -> "lots"
        in 50..99 -> "horde"
        in 100..249 -> "throng"
        in 250..499 -> "swarm"
        in 500..999 -> "zounds"
        else -> "legion"
    }

    println(category)
}



// Quiz2
fun main2a() {
    val number = readln().toIntOrNull()

    val numDigits = when(number){
        in 1..9 -> 1
        in 10..99 -> 2
        in 100..999 -> 3
        else -> 4
    }

    println(numDigits)
}


// Quiz 3
fun main3a() {
    val a = 10
    val b = 11

    when {
        a < 2 -> print(1)
        b > 3 -> print(2)
        a < b -> print(3)
    }
}


//Quiz 4
fun main4a() {
    val x = 11
    when (x) {
        10, 11 -> print("a")
        11, 12 -> print("b")
    }
}


//Quiz 5
fun main5a() {

    val number = 5

    when(number){
        in 1..5 -> print("Number is in the range from 1 to 5")
        else -> print("Number is not in the range from 1 to 5")
    }
}



//Quiz 6
fun checkNumber(number: Int): String{
    return when(number){
        in 1..10 -> "Number is in range 1 to 10"
        in 11..20 -> "Number is in range 11 to 20"
        else -> "Number is outside th range 1 to 20"
    }
}

fun main6a() {
    println(checkNumber(5))
    println(checkNumber(15))
    println(checkNumber(25))
}



//Quiz 7
fun main7a() {
    val number = 5
    val range = 1..10

    when(number){
        in range -> println("$number is in the range ")
        !in range -> println("$number is not in the range")
        else -> println("Unknown number")
    }
}



//Quiz 8
fun main8a() {
    var number = 5
    when(number){
        in 1..3 -> println("Number is in the range 1..3")
        !in 4..10 -> println("Number is not in the range 4..10")
        else -> println("Number is in the range 4..10")
    }
}


//Quiz 9
fun main9a() {

    val house = readln() ?: ""


    val trait = when(house){
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" -> "intellect"
        else -> "not a valid house"
    }

    println(trait)
}




//Quiz 10
fun main10a() {
    val direction = readLine()!!.toInt()

    val output = when (direction) {
        1 -> "move up"
        2 -> "move down"
        3 -> "move left"
        4 -> "move right"
        0 -> "do not move"
        else -> "error"
    }

    println(output)
}





//Quiz 11
fun main11() {
    val number = readLine()!!.toInt()

    val output = when (number) {
        0, 1, 2, 3, 5, 8, 13, 21, 34, 55 -> "F"
        0, 1, 3, 6, 10, 15, 21, 28, 36, 45 -> "T"
        1, 10, 100, 1000, 10000, 100000 -> "P"
        else -> "N"
    }

    println(output)
}



//Quiz12
fun main12a() {
    val shapeNumber = readLine()!!.toInt()

    val shapeName = when (shapeNumber) {
        1 -> "square"
        2 -> "circle"
        3 -> "triangle"
        4 -> "rhombus"
        else -> "There is no such shape!"
    }

    println("You have chosen a $shapeName")
}







// Quiz 13
fun main() {
    val input = readLine()?.trim()
    val number = when (input) {
        "one" -> 1
        "two" -> 2
        "three" -> 3
        "four" -> 4
        "five" -> 5
        "six" -> 6
        "seven" -> 7
        "eight" -> 8
        "nine" -> 9
        else -> null
    }

    println(number)

}








