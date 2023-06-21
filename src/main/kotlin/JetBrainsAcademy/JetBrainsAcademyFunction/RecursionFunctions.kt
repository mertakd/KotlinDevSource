package JetBrainsAcademy.JetBrainsAcademyFunction

/*
fun main() {
    println(printStars(5))
}


fun printStars(n: Int) {
    if (n < 1) return
    print("*")
    printStars(n - 1)
}*/


/*

fun main() {
    val result = factorialRecursive(5)
    println(result)
}

fun factorialRecursive(n: Int): Int {
    if (n == 0 || n == 1) return 1
    return n * factorialRecursive(n - 1)
}*/


fun main() {

    val result = factorial(3)
    println(result)

}

fun factorial(n: Int): Int {
    var f = 1
    for (i in 1..n)
        f *= i
    return f
}




//quiz
/*
*
*fun sumRecursive(n: Int): Int {
    if (n == 1) {
        return 1
    }
    return n + sumRecursive(n - 1)
}

fun main() {
    val n = readLine()?.toIntOrNull()
    if (n != null) {
        println(sumRecursive(n))
    } else {
        println("Invalid input.")
    }
}
 */



/*
* fun digitSum(n: Int): Int {
    if (n < 10) {
        return n // base case: single digit number, return the number itself
    } else {
        val lastDigit = n % 10 // get the last digit
        val remainingDigits = n / 10 // get the remaining digits
        return lastDigit + digitSum(remainingDigits) // recursive call with remaining digits
    }
}

fun main() {
    val n = readLine()?.toIntOrNull()
    if (n != null) {
        val sum = digitSum(n)
        println("Sum of digits: $sum")
    } else {
        println("Invalid input.")
    }
}
*/



/*
* fun isPrime(n: Int, i: Int = 2): Boolean {
    if (n <= 1) {
        return false // base case: numbers less than or equal to 1 are not prime
    }
    if (i * i > n) {
        return true // base case: no divisor found, number is prime
    }
    if (n % i == 0) {
        return false // base case: found a divisor, number is not prime
    }
    return isPrime(n, i + 1) // recursive call, increment divisor
}

fun main() {
    val n = readLine()!!.toInt()
    print(isPrime(n))
}
*/