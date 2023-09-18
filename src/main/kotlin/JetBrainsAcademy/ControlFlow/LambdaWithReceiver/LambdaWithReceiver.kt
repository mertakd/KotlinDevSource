package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.LambdaWithReceiver


/*
* Bir fonksiyonun davranışını değişken olarak da saklayabiliriz. Ayrıca Kotlin, sınıf kalıtımını kullanmadan mevcut sınıfları yeni işlevlerle genişletmenin bir yolunu sunan uzantı işlevlerini sunar.*/
fun Int.isEven() = this % 2 == 0

fun main99() {

    println("Is 2 even?: ${2.isEven()}") // true
    println("Is 3 even?: ${3.isEven()}")  // false
}






//Working with lambdas with receivers
val sum: (Int, Int) -> Int = {a, b -> a + b}
fun main98() {
    println(sum(1, 2)) //3
}



val sum2: Int.(Int) -> Int = {a -> this + a}
fun main97() {
    println(sum2(1,2))
    println(1.sum2(2))
}




fun Int.opp(f: Int.() -> Int): Int = f()
fun main56() {

    var res = 10.opp {this.times(2)}
    println(res)

    res = 10.opp{plus(10)}
    println(res)

    res = 10.opp{this * 2}
}









fun myString(init: StringBuilder.() -> Unit): String {
    return StringBuilder().apply(init).toString()
}

fun main456() {
    val str = myString {
        append("Hello, ".uppercase())
        append("World!")
    }
    println(str) // HELLO, World!
}







fun MutableMap<String, Any>.apply(block: MutableMap<String, Any>.() -> Unit): MutableMap<String, Any> {
    block()
    return this
}

fun main() {
    val student: MutableMap<String, Any> = mutableMapOf(
        "name" to "John",
        "age" to 20
    )

    student.apply {
        this["name"] = (this["name"] as String).uppercase()
        this["age"] = (this["age"] as Int) + 1
    }

    println(student) // {name=JOHN, age=21}
}