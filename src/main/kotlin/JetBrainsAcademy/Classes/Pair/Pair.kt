package JetBrainsAcademy.Classes.Pair

val pairOne = Pair("Hi", "I am a Pair")
val pairTwo = "Hi" to "I am another Pair"


fun main1() {

    // Properties
    println(pairOne.first) // Hi
    println(pairOne.second) // I am a Pair

// Methods
    println(pairTwo.component1()) // Hi
    println(pairTwo.component2()) // I am another Pair


//tostring ve tolist de kullanılır.
    println("to string")
    val pair = Pair("marks", listOf(8.0, 9.0, 10.0))
    println(pair) // (marks, [8.0, 9.0, 10.0]) toString() is implicit
    println(pair.toString()) // (marks, [8.0, 9.0, 10.0])



    //pair i bir listeye dönüştürür.
    val pair2 = Pair("marks", listOf(8.0, 9.0, 10.0))
    println(pair2.toList()) // [marks, [8.0, 9.0, 10.0]]


    //copy() metodu da kullanılabiliyor

}

fun main22() {

    val pair = Pair("marks", listOf(8.0, 9.0, 10.0))
    val other = pair.copy("other")
    val grades = pair.copy(second = listOf(9.0, 7.0, 8.5))
    val myCopy = pair.copy(first = "other", second = listOf(1.0, 2.0, 3.0))
    println(pair) // (marks, [8.0, 9.0, 10.0])
    println(other) // (other, [8.0, 9.0, 10.0])
    println(grades) // (marks, [9.0, 7.0, 8.5])
    println(myCopy) // (other, [1.0, 2.0, 3.0])

    //pair ler değişmezddir sadece kopyalayabiliriz.
}




// Triple
//Triple, Pair gibi, tek bir örnekte aynı veya farklı türlerdeki değerlerin üçlüsünü temsil eden basit bir Kotlin veri türüdür.

fun main4() {

    val triple = Triple(1, "A", true)
    println(triple)
}

fun main() {
    val triple = Triple(1, "I am", "Triple")

// Properties
    println(triple.first) // 1
    println(triple.second) // I am
    println(triple.third) // Triple

// Methods
    println(triple.component1()) // 1
    println(triple.component2()) // I am
    println(triple.component3()) // Triple
}


