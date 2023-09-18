package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.ControlFlow.AdvancedLambdaExpressions

fun main111() {
    val originalText = "I don't know... what to say...123456"
    val textWithoutSmallDigits = originalText.filter {
        val isNotDigit = !it.isDigit()
        val stringRepresentation = it.toString()

        isNotDigit || stringRepresentation.toInt() >= 5
    }
    println(textWithoutSmallDigits)
}



fun main() {
    val originalText = "I don't know... what to say...123456"
    val textWithoutSmallDigits = originalText.filter {
        if (!it.isDigit()) {
            return@filter true
        }

        it.toString().toInt() >= 5
    }
    println(textWithoutSmallDigits)
}