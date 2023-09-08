import Kekod.Boo
import java.util.*

fun main(){
    val (n1) = readln().split(" ")

    val n = n1.toInt()


    when (n) {
        0 -> println("n is zero")
        in 1..10 -> println("n is between 1 and 10 (inclusive)")
        in 25..30 -> println("n is between 25 and 30 (inclusive)")
        else -> println("n is outside a range")
    }
}