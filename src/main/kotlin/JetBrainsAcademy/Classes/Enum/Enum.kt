package JetBrainsAcademy.Classes.Enum

/**
 * Temel olarak Enum'lar mantıksal bir sabitler kümesini temsil eder ve kodumuzu daha net ve okunabilir hale getirir*/



enum class Status {
    OPEN, PENDING, IN_PROGRESS, RESOLVED, REJECTED, CLOSED
}


enum class Materials {
    GLASS, WOOD, FABRIC, METAL, PLASTIC, CERAMICS, CONCRETE, ROCK
}



enum class Rainbow1(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}

fun main1() {

    val color = Rainbow1.RED.color
    println(color)
}


//<-------------------------------------------------------------------->

enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF") ;


    fun printFullInfo() {
        println("Color - $color, rgb - $rgb")
    }


}

fun isRainbow(color: String) : Boolean {
    for (enum in Rainbow.values()) {
        if (color.toUpperCase() == enum.name) return true
    }
    return false
}

fun main2() {

    val rgb = Rainbow.RED.rgb
    println(rgb)


    println("enum function")
    val rgb2 = Rainbow.RED
    rgb2.printFullInfo()




}



//<-------------------------------------------------------------------------------------->
//enum özellikleri
//name : enum instance nın adını alır
//ordinal : enum instance nın pozisyonunu alır.


fun main() {

    val color: Rainbow = Rainbow.RED
    println(color.name)


    println(isRainbow("black"))



}