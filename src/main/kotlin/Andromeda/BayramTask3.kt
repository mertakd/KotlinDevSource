package Andromeda

fun main1() {
    val str = "Mert"
    val result = swapFirstAndLast(str)
    println(result) // Sonuc: aerhaba
}

fun swapFirstAndLast(input: String): String {
    val swapLambda: (String) -> String = { str ->
        if (str.length < 2) {
            str
        } else {
            val firstChar = str[0]
            val lastChar = str[str.length - 1]
            val middle = str.substring(1, str.length - 1)
            lastChar + middle + firstChar
        }
    }

    return swapLambda(input)
}






fun main() {
    val str = "Cimbom"
    val result = swapFirstAndLast(str) { input ->
        val firstChar = input.first()
        val lastChar = input.last()
        val middle = input.substring(1, input.lastIndex)
        lastChar + middle + firstChar
    }
    println(result)
}

fun swapFirstAndLast(input: String, swapFunction: (String) -> String): String {
    return swapFunction(input)
}





