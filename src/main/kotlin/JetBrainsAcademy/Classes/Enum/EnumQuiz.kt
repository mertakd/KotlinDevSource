package JetBrainsAcademy.Classes.Enum

enum class Rainbow2(val colorName: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet"),
    NULL("")
}

fun findByName(name: String): Rainbow2 {
    for (color in Rainbow2.values()) {
        if (name == color.colorName) return color
    }
    return Rainbow2.NULL
}

fun main22() {
    val color = findByName("Black")
    println(color.ordinal)
}





enum class DaysOfTheWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

fun main() {
    for (day in DaysOfTheWeek.values()) {
        println(day.name)
    }
}
