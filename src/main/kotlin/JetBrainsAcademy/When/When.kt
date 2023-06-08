package JetBrainsAcademy.When

fun main1(){
/*
 if-else ile uzun hali
    val input = readLine()!!.split(" ")
    val var1 = input[0]
    val op = input[1]
    val var2 = input[2]

    val a = var1.toInt()
    val b = var2.toInt()

    if (op == "+") {
        println(a + b)
    } else if (op == "-") {
        println(a - b)
    } else if (op == "*") {
        println(a * b)
    } else {
        println("Unknown operator")
    }

*/


    val (var1, op, var2) = readln().split(" ")

    val a = var1.toInt()
    val b = var2.toInt()

    when (op) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        else -> println("Unknown operator")
    }
    //girdi -> 5 + 4
    //çıktı -> 9




    when (op) {
        "+", "plus" -> println(a + b)
        "-", "minus", -> println(a - b) // trailing comma
        "*", "times" -> println(a * b)
        else -> println("Unknown operator")
        // 4 plus 5
        // 9
    }




    //complex block
    when (op) {
        "+", "plus" -> {
            val sum = a + b
            println(sum)
        }
        "-", "minus" -> {
            val diff = a - b
            println(diff)
        }
        "*", "times" -> {
            val product = a * b
            println(product)
        }
        else -> println("Unknown operator")
    }


}


fun main2() {

    //WHEN AS AN EXPRESSION (DEĞER DÖNDÜREN WHEN)

/*

    val result = when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        else -> "Unknown operator"
    }
    println(result)

*/

/*



    println(when(op) {
        "+" -> a + b
        // ...
        else -> "Unknown operator"
    })

*/


/*

    "+" -> {
        val sum = a + b
        sum
    }

    */

}


fun main3(){
    val (var1, var2, var3) = readln().split(" ")

    val a = var1.toInt()
    val b = var2.toInt()
    val c = var3.toInt()

    println(when (c) {
        a + b -> "$c equals $a plus $b"
        a - b -> "$c equals $a minus $b"
        a * b -> "$c equals $a times $b"
        else -> "We do not know how to calculate $c"
    })

/*

    when (n) {
        0 -> println("n is zero")
        in 1..10 -> println("n is between 1 and 10 (inclusive)")
        in 25..30 -> println("n is between 25 and 30 (inclusive)")
        else -> println("n is outside a range")
    }

    */


    //in a..b, in c..d -> println("n belongs to a range")
}


fun main4() {

    val n = readln().toInt()

    when {
        n == 0 -> println("n is zero")
        n in 100..200 -> println("n is between 100 and 200")
        n > 300 -> println("n is greater than 300")
        n < 0 -> println("n is negative")
        // else-branch is optional here
    }

}





    fun main5() {

        val answer = readLine()

        val result = when (answer) {
            "1", "Java"  -> "Yes!"
            "2", "Kotlin"  -> "Yes!"
            "3", "Scala"  -> "Yes!"
            "4", "Python"  -> "Yes!"
            else -> "Unknown number"
        }

        println(result)
    }


fun main() {

//when expression
//We need your help to improve the adaptive system. Write a program that finds out which programming language a student is learning. I hope you know the correct answer.

//Which programming language are you learning?

//Java

//Kotlin

//Scala

//Python

//The program is to read the numerical answer from the standard input and output the result: Yes!, No!, or Unknown number.



//Sample Input 1: 2
//Sample Output 1: Yes!

//Sample Input 1: 6
//Sample Output 1: Unknown number







}

