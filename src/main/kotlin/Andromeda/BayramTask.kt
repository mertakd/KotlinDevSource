package Andromeda

fun main() {
    val names = arrayOf("metehan", "ibrahim ethem", "hilal")
    val character = 'a'
    val result = names removeCharacter character
    //val result = names.removeCharacter(character)
    println(result.joinToString())
}


infix fun Array<String>.removeCharacter(inputCharacter: Char): Array<String> {
    return map { names ->
        names.filter { it != inputCharacter }
    }.toTypedArray()
}

