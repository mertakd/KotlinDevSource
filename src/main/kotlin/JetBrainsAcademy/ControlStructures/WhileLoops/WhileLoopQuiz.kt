package JetBrainsAcademy.ControlStructures.WhileLoops

//Quiz 1
fun main1() {
    var i = 3
    do {
        println(i)
        i--
    } while(i > 3)
    println(i)
}



//Quiz 2
fun main2() {
    var i = 5

    do {
        i++
        print("$i ")
        i -= 2
    } while (i > 1)

}


//Quiz 3  çif sayıları yazdır
fun main3() {

    var i = 0

    while (i < 10){
        i++
        if (i % 2 == 0){
            print("$i") //2 4 6 8 10
        }
    }
}




// Quiz 4
fun findYears(depo: Double): Int{
    var deposit = depo
    val interestRate = 1.071
    val max = 700000
    var years = 0

    while (deposit <= max) {
        deposit *= interestRate
        years++
    }

    return years
}




//Quiz 5 karesini alma
fun main5() {
    val N = readLine()!!.toInt()
    var i = 1 // Start with the first natural number

    while (i * i <= N) {
        println(i * i)
        i++
    }
}




// Quiz 6
fun main6() {
    val n = readln().toInt()

    var square = 1
    while (square * square <= n) {
        println(square * square)
        square++
    }
}


//Quiz 7   ? anlaşılmadı
fun main() {
    val n = readLine()!!.toInt() // Read the number of elements from input
    var currentNumber = 1 // Initialize the current number as 1
    var count = 0 // Initialize a count to keep track of repetitions

    while (count < n) {
        var repetitions = 0 // Initialize repetitions for the current number
        while (repetitions < currentNumber && count < n) {
            print("$currentNumber ")
            repetitions++
            count++
        }
        currentNumber++ // Increment the current number
    }
}


