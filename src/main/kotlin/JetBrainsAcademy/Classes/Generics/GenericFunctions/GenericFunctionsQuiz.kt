package JetBrainsAcademy.Classes.Generics.GenericFunctions

// Quiz 1
fun <T> someFunction(a: T): T {
    return a
}

fun main1() {
    println(someFunction(1))
}


// Quiz 2

fun <T> countItem(list: List<T>, item: T): Int {
    return list.count { it == item }
}

fun main2() {
    val numbers = listOf(1,2,3,2,4,2,5)
    val countOfTwos = countItem(numbers, 2)
    println("Count of twoos: $countOfTwos")
}



// Quiz 3
class Box<T>(val item: T){}

fun <T> Box<T>.guessBox(){
    println("In this box you have: $item")
}

fun main3() {

    val stringBox = Box("Books")
    val intBox = Box(42)

    stringBox.guessBox()
    intBox.guessBox()
}



// Quiz 4
class ListUtils {

    companion object Info {

        fun <T> info(list: List<T>): String {
            if (list.isEmpty()) {
                return "[]"
            }
            return list.joinToString ( ", ", "[", "]" )
        }
    }
}

fun main() {

    val numbers = listOf(1,2,3,4,5)
    val emptyList = emptyList<Int>()

    val numbersInfo = ListUtils.Info.info(numbers)
    val emptyListInfo = ListUtils.Info.info(emptyList)

    println(numbersInfo)
    println(emptyListInfo)
}