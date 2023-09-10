package JetBrainsAcademy.Collections.List

fun main1() {

    //Özetlemek gerekirse: İçeriğin değişmesini istemediğinizde Liste'yi kullanın.

    /*val cars = listOf<String>("BMW", "Honda", "Mercedes")
    cars[0] = "Renault" // Error
    *array e yenini bir element eklenebilir ama değiştirilemez.çünkü immutable dir. */


    val partyList = listOf("Fred", "Emma", "Isabella", "James", "Olivia")

    println("Emma came in ${partyList.indexOf("Emma") + 1}") // Emma came in 2
    println("Guys, is it true that Isabella came? It's ${partyList.contains("Isabella")}") // Guys, is it true that Isabella came? It's true



    val participants = listOf("Fred", "Emma", "Isabella")

    for (participant in participants) {
        println("Hello $participant!")
    }
}


fun main2() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val sum = solution(input)
    println(sum)
}

fun solution(numbers: List<Int>): Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    return sum
}

fun solution2(numbers: List<Int>): Int = numbers.sum()
val solution3: (numbers: List<Int>) -> Int = { it.sum() }



/*
* val partyList = listOf("Fred", "Emma", "Isabella", "James", "Olivia")
    val indexOfEmma = partyList.indexOf("Olivia")
    println("Emma'nın indeksi: $indexOfEmma")
    * 4. index de*/
