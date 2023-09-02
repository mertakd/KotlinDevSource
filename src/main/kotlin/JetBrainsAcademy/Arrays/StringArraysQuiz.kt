package JetBrainsAcademy.Arrays

// array lere Re-creating yapılıyor, Editing yapılamıyor.

//Quiz 1
fun main21() {
    val beyondTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()

    val isOnPatrol = beyondTheWall.contentEquals(backFromTheWall)
    println(isOnPatrol)
}


//Quiz 2
fun main56() {
    var backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val returnedWatchman = readLine()!!.toString()
    // do not touch the lines above
    // write your code here
    // Add the returnedWatchman to the backFromTheWall array
    backFromTheWall += returnedWatchman

    // Print the updated backFromTheWall array with joinToString()
    println(backFromTheWall.joinToString(", "))
}



//Quiz 3
fun main() {
    val firstArray = readLine()!!.split(' ').map { it }.toTypedArray()
    val secondArray = readLine()!!.split(' ').map { it }.toTypedArray()

    // Concatenate the two arrays
    val resultArray = firstArray + secondArray

    // Print the concatenated array using joinToString
    println(resultArray.joinToString(", "))
}

