package JetBrainsAcademy.Classes.OperatorOverloading

import Kekod.Boo
import Kekod.Classes.Print2


operator fun Int.unaryMinus() = this


fun main1() {
    val point = 29
    println(-point)
}



infix operator fun String.times(n: Int) = this.repeat(n)
fun main2() {
    val s = "Kotlin"
    println(s * 3)
}




// 2.Unary operations
operator fun Pair<Int, Int>.unaryMinus() = Pair(-first, -second)
operator fun Pair<Int, Int>.inc() = Pair(first + 1, second + 1)

fun main3() {

    var p = Pair(1, 2)
    println(-p)
    println(++p)

}





// Binary operat
operator fun Pair<Int, Int>.plus(other: Pair<Int, Int>) =
    Pair(first + other.first, second + other.second)


fun main4() {

    var point1 = Pair(1,2)
    var point2 = Pair(3,4)
    println(point1 + point2)  // (4, 6)
}



//in operator
operator fun Pair<Int,Int>.contains(n:Int) = n in first..second

fun main5() {
    var point1 = Pair(1, 2)
    println(1 in point1) //true
}





//Indexed access operator
operator fun Pair<Int,Int>.get(n:Int) = when(n){
    0 -> first
    1 -> second
    else -> throw IndexOutOfBoundsException()
}


fun main6() {

    var point = Pair(29,22)
    println(point[0])
    println(point[1])

}




//invoke operator
operator fun Pair<Int,Int>.invoke(newLine:Boolean){
    print("($first, $second)")
    if (newLine) println()
}


fun main7() {
    var point1 = Pair(1,2)
    println(true)
}



//Augmented assignments
//a += b
//a.plusAssign(b)
operator fun StringBuilder.plusAssign(other:String){
    this.append(other)
}


fun main() {
    val name = StringBuilder("Kotlin")
    name += " is awesome"
    println(name) // Kotlin is awesome

}





