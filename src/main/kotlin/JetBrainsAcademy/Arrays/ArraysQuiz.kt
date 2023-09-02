package JetBrainsAcademy.Arrays

//Basiz Quiz

// array türleri
//val array = IntArray(3)
//val array = intArrayOf(1, 2, 3)

// Quiz 1
fun main12() {
    val numbers = intArrayOf(12, 17, 8, 101, 33)
    println(numbers.joinToString())
}


//Quiz 2
fun main13() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val n = 6
    val elem = arr[arr[n]]
}


//Quiz 3
fun main34() {
    val array = charArrayOf('!' ,'@', '#', '$')
    println(array[array.size-1]) // $
    println(array.last()) // $

    println(array.lastIndex) // 3


    println("access the first element of an array.")
    //access the first element of an array.
    println(array.first())
    println(array[0])

}



// Quiz 4
fun main333() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()

    // Swap the first and last elements
    if (numbers.size >= 2) {
        val temp = numbers[0]
        numbers[0] = numbers[numbers.size - 1]
        numbers[numbers.size - 1] = temp
    }

    println(numbers.joinToString(separator = " "))
}
fun main55() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    // Do not touch lines above
    // Write only exchange actions here.
    numbers[0] = numbers[numbers.lastIndex].also { numbers[numbers.lastIndex] = numbers[0] }
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}




//Quiz 5

fun main01() {
    val numbers = IntArray(100) { index ->
        when (index) {
            0 -> 1
            9 -> 10
            99 -> 100
            else -> 0
        }
    }

    println(numbers.joinToString())
}

fun main() {
    val numbers = IntArray(100) { i ->
        when (i) {
            0, 9, 99 -> i + 1
            else -> 0
        }
    }
    println(numbers.joinToString())
}


