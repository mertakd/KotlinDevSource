package JetBrainsAcademy.Loops

fun main2a() {

    var i = 0
    while (i > 0) {
        println(i)
        i--
    }
    println("Completed")

}


fun main3a() {

    var i = 3
    do {
        println(i)
        i--
    } while(i > 3)
}


fun main4a() {

    var i = 5

    do {
        i++
        print("$i")
        i -= 2

    }while (i > 1)

}




fun main() {

    var i = 0

    while (i < 10){
        i++
        if (i % 2 == 0){
            print("$i")
        }
    }
}














