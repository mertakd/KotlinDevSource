package JetBrainsAcademy.CinemaRoomManager

fun main() {
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seats = readLine()!!.toInt()
    when (val totalSeats = rows * seats) {
        in 0..60 -> {
            println("Total income:")
            println("$${totalSeats * 10}")
        }
        else -> {
            println("Total income:")
            if (rows % 2 != 0) {
                println("$${(rows / 2) * seats * 10 + (rows / 2 + 1) * seats * 8}")
            } else {
                println("$${(rows / 2) * seats * 10 + (rows / 2) * seats * 8}")
            }
        }
    }
}