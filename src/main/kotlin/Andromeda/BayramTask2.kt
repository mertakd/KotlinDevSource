package Andromeda

fun main() {
    val list1 = listOf("metehan", "11", true, 5f, "hilal", 4.3, "ibrahim ethem", 12, 4f)
    val list2 = listOf("domates", "58", false, 5f, "senem", 4.3, "ibrahim ethem", 12, 3f)
    val character = 'a'

    val result = list1.zip(list2) { value1, value2 ->
        when {
            value1 is String && value2 is String -> value1.removeCharacter(character)
            value1 is Boolean -> value1.inverse()
            value1 is Int -> value1.square()
            else -> value1
        }
    }.filterNotNull()

    println(result)
}

infix fun String.removeCharacter(character: Char): String {
    return replace(character.toString(), "")
}

fun Boolean.inverse(): Boolean {
    return !this
}

fun Int.square(): Int {
    return this * this
}
