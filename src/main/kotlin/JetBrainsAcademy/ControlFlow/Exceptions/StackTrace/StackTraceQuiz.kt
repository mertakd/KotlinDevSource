package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.StackTrace

fun main1() {
    val input = "110 111 32 101 114 114 111 114 32 59 41".split(" ")
    input.forEach { print(it.toInt().toChar()) }
}






//Using stack trace
//Thread.currentThread().getStackTrace()[0]








// QUIZ
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index -1 out of bounds for length 0
//	at java.base/java.lang.String.checkIndex(String.java:4557)
//	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
//	at java.base/java.lang.String.charAt(String.java:1515)
//	at MainKt.myPrintLn(Main.kt:9)
//	at MainKt.main(Main.kt:5)
//	at MainKt.main(Main.kt)



//Exception type
//Exception thread
//The reason why the exception was thrown
//The method where the exception was thrown
//The line number where the exception was thrown

//StringIndexOutOfBoundsException
//main
//Index -1 out of bounds for length 0
//myPrintLn()
//9







//Quiz
fun main2() {
    val input = "1 2 3 4 5 6 7 8 9 10"
    demoList(input)
}

fun demoList(input: String) {
    val inputList = input.split(" ")
    println(inputList[-1])
}







// Quiz
//What data structure does the stack trace have?
//LIFO





fun main() {
    val demoArray = intArrayOf(0, 1, 2, 3, 4, 5)
    demo(demoArray)
}

fun demo(input: IntArray) {
    println(input[10])
}