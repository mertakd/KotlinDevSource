package JetBrainsAcademy.Arrays

// Quiz 1
// toplam bul
fun main99() {
    var numbers = intArrayOf(1,2,3,4,5)

    var sum = 0

    for (num in numbers){
        sum += num
    }
    println(sum)

    for (i in numbers.lastIndex downTo 0){
        sum += numbers[i]
    }
}


// Quiz 2
fun main2() {
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
}

// kısa yolu
fun main2b() {
    val nums = Array(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    print(nums.count { it == m })
}



// Quiz 3
fun main3a() {
    val n = readLine()!!.toInt()
    val numbers = IntArray(n) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()

    var found = false
    for (num in numbers) {
        if (num == m) {
            found = true
            break
        }
    }

    val result = if (found) "YES" else "NO"
    println(result)
}

fun main3b() {
    val ar = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    println(if (ar.contains(readLine()!!.toInt())) "YES" else "NO")
}



// Quiz 4
fun main() {
    val n = readLine()!!.toInt()
    val numbers = IntArray(n) { readLine()!!.toInt() }
    val (p, m) = readLine()!!.split(" ").map { it.toInt() }

    var found = false
    for (i in 0 until n - 1) {
        if ((numbers[i] == p && numbers[i + 1] == m) || (numbers[i] == m && numbers[i + 1] == p)) {
            found = true
            break
        }
    }

    val result = if (found) "NO" else "YES"
    println(result)
}

