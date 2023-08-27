package JetBrainsAcademy.Classes.Object.ObjectDecleration

object PlayingField{


    object Size{
        var width:Int = 0
        var height:Int = 0

    }

    fun changeSize(newWidth:Int, newHeight:Int){
        Size.width = newWidth
        Size.height = newHeight
    }



}

fun main() {
    val play = PlayingField.changeSize(5,8)
    println(play)
}