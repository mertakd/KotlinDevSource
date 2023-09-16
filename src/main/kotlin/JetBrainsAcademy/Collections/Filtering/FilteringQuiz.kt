package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Collections.Filtering

//Quiz 1
fun main1a() {
    val list = readln().split(" ")
    // write your code here
    val res = list.filter { it == "red" || it == "blue" }

    println(res)
}

fun main1b() = readln().split(" ").filter { "bluered".contains(it) }.let(::print)
fun main1c() = with(setOf("blue", "red")) {
    println(readln().split(' ').filter(::contains))
}
fun main1d() {
    readln()
        .split(" ")
        .filter { it == "blue" || it == "red" }
        .also(::println)
}




//Quiz 2
fun main2() {

    val list = readln().split(" ")

    val res = list.drop(1).filter { it.length ==  5 }
}




//Quiz 3
fun main3() {

    val list = readln().split(" ")
    println(list.filter { it == it.reversed() })
}



// Quiz 4
fun main4() {
    val list = readLine()?.split(" ") ?: emptyList() // Read the input and split it into a list

    // Filter words that start and end with 'a'
    val res = list.filter { it.startsWith("a", ignoreCase = true) && it.endsWith("a", ignoreCase = true) }

    println(res)
}




// Quiz 5
fun main5() {
    val list = readln().split(" ").map { it.toInt() }
    // write your code here
    val res = list.filter{ it % 3 == 0}

    println(res)
}
