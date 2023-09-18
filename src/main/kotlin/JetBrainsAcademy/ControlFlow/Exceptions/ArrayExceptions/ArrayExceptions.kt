package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.ArrayExceptions

fun main99() {

    val numbers: IntArray? = null
    val size = numbers!!.size // It throws NPE
    println(size)

    val size2 = if (numbers == null) 0 else numbers.size
}




//NegativeArraySizeException
fun main98() {
    val negSize = -1
    val numbers = IntArray(negSize) // an exception here
    println(numbers)
}



//ArrayIndexOutOfBoundsException
fun main97() {

    val array = intArrayOf(1, 2, 3) // an array of ints
    val n1 = array[2] // n1 is 3
    //val n2 = array[3] // Exception

    //val n3 = array[0];  // OK
    val n4 = array[-1]; // Exception   bunun yerine [0, size - 1] ilk ve son index kontrolü
    println(n4)
}




fun main95() {
    val hardCodedArray = intArrayOf(3, 2, 4, 5, 1)
    val index = readln().toInt()
    if (index < 0 || index > hardCodedArray.size - 1) {
        println("The index is out of bounds.")
    } else {
        println(hardCodedArray[index])
    }

    //the index is 0, the program outputs "3";
    //
    //the index is 1, the program outputs "2";
    //
    //the index is 4, the program outputs "1";
    //
    //the index is -1, the program outputs "The index is out of bounds.";
    //
    //the index is 5, the program also outputs "The index is out of bounds."
}









//StringIndexOutOfBoundsException
fun main90() {
    val string = "string"
    val ch = string[6] // Exception StringIndexOutOfBoundsException
}


fun main() {

    val string = "string"
    val index = readln().toInt()
    if (index <= string.length - 1)
        println(string[index])
    else
        println("The check works, there is no exception.")
}