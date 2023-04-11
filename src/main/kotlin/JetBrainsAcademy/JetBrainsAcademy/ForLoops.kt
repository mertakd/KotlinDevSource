package JetBrainsAcademy.JetBrainsAcademy

fun main1() {

    for (i in 1..3) {
        for (j in 1..i) {
            print(j)
        }
    }

}


fun main2() {
    val count = readLine()!!.toInt()

    var max1 = 0
    var max2 = 0

    for (i in 1..count) {
        val number = readLine()!!.toInt()

        if (number > max1 || number > max2) {
            if (max1 > max2) max2 = number else max1 = number
        }
    }

    println(if (max2 == 0) max1 else max1 * max2)
}

fun main3() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var sum = 0
    for (i in a..b) {
        sum += i
    }
    println(sum)
}


fun main4() {
    for (i in 1..3){
        for (j in 1..i){
            println(j)
        }
    }
}

fun main5() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var sum = 0
    for (i in a..b) {
        sum += i
    }
    println(sum)
}


fun main6() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    var count = 0
    for (i in a..b){
        if (i % n == 0){
            count++
        }
        println(count)
    }
}


fun main() {
    val count = readLine()!!.toInt()

    var max1 = 0
    var max2 = 0

    for (i in 1..count) {
        val number = readLine()!!.toInt()

        if (number > max1 || number > max2) {
            if (max1 > max2) max2 = number else max1 = number
        }
    }

    println(if (max2 == 0) max1 else max1 * max2)
}
