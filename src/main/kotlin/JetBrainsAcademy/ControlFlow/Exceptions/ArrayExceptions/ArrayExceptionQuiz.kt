package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.ArrayExceptions




// Quiz 1
fun main1() {

    val string = readln()
    val index = readln().toInt()

    if (index >= 0 && index < string.length){
        println(string[index])
    }else{
        println("out of bounts!")
    }
}



// Quiz 2
fun calculateSquare(array: IntArray?, index: Int) {
    try {
        if (array != null && index >= 0 && index < array.size) {
            val element = array[index]
            val square = element * element
            println(square)
        } else {
            println("Exception!")
        }
    } catch (e: Exception) {
        println("Exception!")
    }
}
