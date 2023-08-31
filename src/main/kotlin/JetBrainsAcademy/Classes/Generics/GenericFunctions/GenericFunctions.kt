package JetBrainsAcademy.Classes.Generics.GenericFunctions


fun <T> doSomething(t: T): T {
    return t
}





//Generic functions can also take or return values of non-generic types
fun <T> calculateLength(list: List<T>): Int {
    return list.size
}

fun main22() {

    var list = listOf("hello", "from", "hyperskill")
    println(calculateLength<String>(list)) //3
    //arguman type belirtilmeli.<String>
}



//Tıpkı generic sınıflar gibi, generic işlevler de çeşitli tür parametrelerine sahip olabilir.
fun <T,U> multipleDoSomething(t: T, u: U){
    // do something
}



// Generic methods
class NonGenericClass {
    fun <T> someGenericMethod(t: T): T {
        //...//
        return t
    }
}


fun main23() {
    var item = NonGenericClass()
    var value = item.someGenericMethod("Hello!")
    println(value)
}




class BiggerBox<T>(var value1: T, var value2: T) {}

fun <T> BiggerBox<T>.changeBoxes() {
    val tmp = this.value1
    this.value1 = this.value2
    this.value2 = tmp
}

fun main() {
    var box = BiggerBox("hyperskill", "kotlin")
    println("${box.value1} and ${box.value2}")// hyperskill and kotlin
    box.changeBoxes()
    println("${box.value1} and ${box.value2}")// kotlin and hyperskill
}