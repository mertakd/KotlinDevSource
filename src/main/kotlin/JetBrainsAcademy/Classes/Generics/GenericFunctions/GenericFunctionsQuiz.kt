package JetBrainsAcademy.Classes.Generics.GenericFunctions



//Sözel

//A generic function is a function that ...
//has a type parameter as an argument type or return type




//Matching incorrect statements
//Select all the incorrect statements about generic functions.

//A generic function may or may not be a member of some class.
//We need to declare a type parameter inside angle brackets as a generic function's argument type.






// fun doGeneric(t:T):String
// fun <T> doGeneric(t:T):String






//Advantages of generics
//Let's think about the advantages of using generics. Which statements are correct?

//Generic methods help us write reusable code and give us functionality for constructing abstractions for it
//
//They are useful when we don't want to depend on the type of arguments that we pass to a function
//
//Generics give us the opportunity to avoid the duplication of code










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

fun main43563464() {

    val numbers = listOf(1,2,3,2,4,2,5)
    val countOfTwos = countItem(numbers, 2)
    println("Count of twoos: $countOfTwos")
}

/*
* generic yapı olmasaydı her type için farklı fonksiyon yazmak zorunda kalcaktık
* fun countIntItem(list: List<Int>, item: Int): Int {
    return list.count { it == item }
}*/









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

fun main95() {

    val numbers = listOf(1,2,3,4,5)
    val emptyList = emptyList<Int>()

    val numbersInfo = ListUtils.Info.info(numbers)
    val emptyListInfo = ListUtils.Info.info(emptyList)

    println(numbersInfo)
    println(emptyListInfo)
}




// Quiz 5
class SomeCollection<T>(val list: List<T>){

    fun invert(){
        val reversed = list.reversed()
        println(reversed)
    }
}


fun main23423() {

    val list = listOf("hello","bonjuu","guten tag")
    val collection = SomeCollection(list)
    collection.invert()
}






// Quiz 6
class Foo {
    fun <T> T.foo(that: T): T = throw Exception()

    init {
        "str".foo(42)
    }

    //Any türü en üst tür
}



