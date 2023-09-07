package JetBrainsAcademy.ControlStructures.IfExpression



import java.time.LocalDate

fun main1() {
    /*
        //Kotlin's if is an expression, not a statement.
        val max = if (a > b) {
            println("Choose a")
            a
        } else {
            println("Choose b")
            b
        }


        //kısa hali
        val max = if (a > b) a else b


        //sonucu yeni bir değişkende depolamazsak
        val a = readln().toInt()
        val b = readln().toInt()

        println(if (a == b) {
            "a equal b"
        } else if (a > b) {
            "a is greater than b"
        } else {
            "a is less than b"
        })



       //java stili ile de yazılabilir kotlinde
       final String msg = num > 10
      ? "Number is greater than 10"
      : "Number is less than or equal to 10";



      //if else yerine when kullan
        val number = 5
        when (number) {
            1 -> println("One")
            2 -> println("Two")
            3 -> println("Three")
            4 -> println("Four")
            else -> println("Number is greater than four")
            }


         //Expression(değer döndüren) olarak when kullanımı
         val number = 3
        val message = when (number) {
            1 -> "One"
            2 -> "Two"
            3 -> "Three"
            4 -> "Four"
            else -> "Number is greater than four"
        }

        println(message) // Output: Three




        //Using "when" with ranges and conditions
        val number = 15
        when {
            number < 0 -> println("Negative number")
            number in 1..10 -> println("Number between 1 and 10")
            number % 2 == 0 -> println("Even number")
            else -> println("Odd number greater than 10")
            }




        */
}

fun main2() {
    val a = readln().toInt()
    val b = readln().toInt()

    val max = if(a > b) a else b
    println(max)
}






//girilen sayı 2 3 5 6 ya bölünebliyor mu.
fun main3() {
    val two = 2
    val three = 3
    val five = 5
    val six = 6
    val st = "Divided by"
    val num = readLine()!!.toInt()

    if (num % two == 0) {
        println("$st $two")
    }
    if (num % three == 0) {
        println("$st $three")
    }
    if (num % five == 0) {
        println("$st $five")
    }
    if (num % six == 0) {
        println("$st $six")
    }
}


//girilen sayı 2 3 5 6 ya bölünebliyor mu. Çözüm 2.
fun main4() {
    val number = readLine()!!.toInt()
    listOf(2, 3, 5, 6).forEach { if (number % it == 0) println("Divided by $it") }
}









fun main5() {

    val number = readlnOrNull()?.toInt() ?: 0

    if (number % 2 == 0) {
        println("EVEN")
    } else {
        println("ODD")
    }
}


//arık yıl bulmak
fun main6(args: Array<String>) {
    val year = readLine()!!.toInt()
    println(if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) "Leap" else "Regular")
}

//artık yıl diğer çözüm.
fun main7() {
    val year = LocalDate.of(readLine()!!.toInt(), 1, 1)
    println(if (year.isLeapYear) "Leap" else "Regular")
}


fun main8() {
    val num = readln().toInt()
    println(if (num in -14..12 || num in 15..16 || num >= 19) "True" else "False")
}





fun main9() {
    val minSleepHours = readLine()!!.toInt()
    val maxSleepHours = readLine()!!.toInt()
    val annSleepHours = readLine()!!.toInt()

    val output: String

    if (annSleepHours < minSleepHours) {
        output = "Deficiency"
    } else if (annSleepHours > maxSleepHours) {
        output = "Excess"
    } else {
        output = "Normal"
    }

    println(output)
}


fun main10() {
    val number = readLine()!!.toInt()

    val output: String

    if (number > 0) {
        output = "YES"
    } else {
        output = "NO"
    }

    println(output)
}

fun main11() = if (readLine()!!.toInt() > 0) println("YES") else println("NO")


fun main12() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()

    val maxNumber = if (number1 >= number2 && number1 >= number3) {
        number1
    } else if (number2 >= number1 && number2 >= number3) {
        number2
    } else {
        number3
    }

    println(maxNumber)
}













