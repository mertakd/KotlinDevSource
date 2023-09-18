package JetBrainsAcademy.Projects.CoffeeMachine.Atom.FunctionalProgramming.HigherOrderFunctions

//Bir dil, eğer işlevleri diğer işlevleri argüman olarak kabul edebiliyorsa ve dönüş değerleri olarak işlevler üretebiliyorsa, üst düzey işlevleri destekler.


//bir lambda referans olarak saklanabilir.
val isPlus: (Int) -> Boolean = {it > 0}

fun main1() {
    val result = listOf(1, 2, -3).any(isPlus)
    println(result)
}



//Bir işlevi bir referans aracılığıyla çağırmanın sözdizimi sıradan bir işlev çağrısıyla aynıdır:
val helloWord: () -> String = {"Hello, world!"}

val sum: (Int, Int) -> Int = {x,y -> x + y}

fun main2() {
    helloWord()
    sum(1,2)
}







fun<T>List<T>.any(
    predicate: (T) -> Boolean
): Boolean{
    for (element in this){
        if (predicate(element))
            return true
    }
    return false
}


fun main() {

    val ints = listOf(1, 2, -3)
    ints.any { it > 0 } // true

    val strings = listOf("abc", " ")
    strings.any { it.isBlank() } //true
    strings.any(String::isNotBlank)
}