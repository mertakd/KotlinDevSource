package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.Exceptions.TryCatchStatement

// Quiz 1
fun convertStringToDouble(input: String): Double{

    try {
        return input.toDouble()
    }catch (e: NumberFormatException){
        return 0.0
    }
}




// Quiz 2
fun printFifthCharacter(input: String): String{

    try {
        val fifthChar = input[4]
        return "The fifth character of the entered word is $fifthChar"
    }catch (e: StringIndexOutOfBoundsException){
        return "The input word is too short!"
    }
}