package JetBrainsAcademy.Arrays

fun main3() {

    //Iterating through an array
    /*

    for (element in array){
        //body of loop
    }
*/


    val daysOfWeek = arrayOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

    for (day in daysOfWeek){
        println(day)
    }



    println("Iterating by indexes")
    //Iterating by indexes
    for (index in daysOfWeek.indices){
        println("$index: ${daysOfWeek[index]}")
    }
    //index 0..6 ya kadar olan index i alır
    //daysOfWeek[index] bu da haftanın günlerini yazdırır.






    println("Iterating by range indexes")
    //Iterating by range indexes
    for (index in 1..5){
        println("$index: ${daysOfWeek[index]}")
    }

    println("access last index")
    for (index in 1 until daysOfWeek.lastIndex){
        println("$index: ${daysOfWeek[index]}")
    }


    println("down to step")
    for (index in daysOfWeek.lastIndex downTo 0 step 2){
        println("$index: ${daysOfWeek[index]}")
    }
}


fun main33() {

    val size = readln().toInt()
    val array = IntArray(size)

    for (i in 0..array.lastIndex) {
        array[i] = readln().toInt()
    }

    for (i in array.lastIndex downTo 0) {
        print("${array[i]} ")
    }
}



fun main4() {
    val n = readLine()!!.toInt()
    val numbers = IntArray(n) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()

    var count = 0
    for (num in numbers) {
        if (num == m) {
            count++
        }
    }

    println(count)


   /*
    //kısa yolu
    val nums = Array(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    print(nums.count { it == m })

    */

}


fun main566() {
    val n = readLine()!!.toInt()
    val numbers = IntArray(n) { readLine()!!.toInt() }

    var tripleCount = 0
    for (i in 0 until n - 2) {
        if (numbers[i] + 1 == numbers[i + 1] && numbers[i] + 2 == numbers[i + 2]) {
            tripleCount++
        }
    }

    println(tripleCount)
}


fun main() {
    val size = readln().toInt()
    val array = IntArray(size)

    for (i in 0..array.lastIndex) {
        array[i] = readln().toInt()
    }

    for (i in array.lastIndex downTo 0) {
        print("${array[i]} ")
    }
}