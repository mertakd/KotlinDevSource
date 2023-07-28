package JetBrainsAcademy.MutableList

//QUIZ









fun main1a() {

    //The first and last element of a list
    //list[0]
    //list.first()
    //numbers.size  total element


    //numbers.last()               last element
    //numbers[numbers.lastIndex]   last index
    //numbers[numbers.size -1]     last index



    //val list = mutableListOf(1, 2, 3)
    //val list = MutableList(3) { 0 }


}


fun main2a() {
    //Initializing a mutable list of integers


    val numbers = mutableListOf(12, 17, 8, 101, 33)
    println(numbers.joinToString())
    //joinToString() parantezleri kaldırıyor


    val longs = mutableListOf(100_000_000_001L, 100_000_000_002L, 100_000_000_003L)
    println(longs.joinToString())
    //alt tireleri kaldırıyor.


    val characters = mutableListOf('a', 'z', 'e', 'd')
    println(characters.joinToString())
    //tek tırnakları kaldırıyor.


    val list = MutableList(3) { 0 }
    println(list)
}

fun main3a() {

    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8 , 9)
    val n = 6
    val enem = list[list[n]]
    println(enem)
}


fun main4a() {

    val numbers = readln().split(' ').map { it.toInt() }.toMutableList()

    val temp = numbers[0]
    numbers[0] = numbers[numbers.size -1]
    numbers[numbers.lastIndex] = temp

    println(numbers.joinToString (separator = " "))

}

fun main() {

    val numbers = MutableList(100){0}
    numbers[0] = 1
    numbers[9] = 10
    numbers[99] = 100

    println(numbers.joinToString())

}






