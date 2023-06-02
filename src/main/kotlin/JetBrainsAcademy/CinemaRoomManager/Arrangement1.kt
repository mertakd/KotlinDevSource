package JetBrainsAcademy.CinemaRoomManager

fun main() {
    val numRows = 7
    val numSeatPerRow = 8

    //print the cinema header
    println("Cinema: ")


    //print the seat numbers of each row
    for (i in 1..numSeatPerRow){
        print("$i")
    }
    println() //move to the next line

    //print the seating arrangement
    for (row in 1..numRows){
        print("$row")

       for (seat in 1..numSeatPerRow){
           print("S")
       }

        println()


    }
}