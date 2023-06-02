package JetBrainsAcademy.Functions

fun main() {

    val breadFromFrodo = readln()
    val breadFromSam = readln()

    //argüman
    totalLembas(breadFromFrodo,breadFromSam)
}


fun totalLembas(first:String, second:String){
    print(first.toInt() + second.toInt())
}