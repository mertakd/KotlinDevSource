package JetBrainsAcademy.Classes.DataClass


/**
 * Kısa Sorular
 * copy() metodu override edilemez.
 * */

//quiz 1
data class Box1(val height:Int, val length:Int, val width:Int){
    var size:Int = height + length +width

    override fun toString(): String {
        return "Box(height=$height, width=$width, size=$size)"
    }
}


fun main11() {
    val box = Box1(3,15,2)
    println(box.size)
}



//quiz2
data class Box(val height: Int, val length: Int, val width: Int)

fun main22() {
    val box = Box(3,4,9)
    val copyBox = box.copy(length = 1)

    println(box)
    println(copyBox)

}

