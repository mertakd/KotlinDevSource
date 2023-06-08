package JetBrainsAcademy.CinemaRoomManager

fun main1() {
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seats = readLine()!!.toInt()

    val cinema = Array(rows) { Array(seats) { "S" } }

    while (true) {
        println("\n1. Show the seats")
        println("2. Buy a ticket")
        println("0. Exit")
        print("> ")

        when (readLine()!!.toInt()) {
            1 -> {
                println("\nCinema:")
                print("  ")
                for (i in 1..seats) {
                    print("$i ")
                }
                println()
                for (i in 0 until rows) {
                    print("${i + 1} ")
                    for (j in 0 until seats) {
                        print("${cinema[i][j]} ")
                    }
                    println()
                }
            }
            2 -> {
                println("\nEnter a row number:")
                val chosenRow = readLine()!!.toInt()
                println("Enter a seat number in that row:")
                val chosenSeat = readLine()!!.toInt()

                val ticketPrice: Int = if (rows * seats <= 60 || chosenRow <= rows / 2) {
                    10
                } else {
                    8
                }

                println("\nTicket price: \$$ticketPrice")

                cinema[chosenRow - 1][chosenSeat - 1] = "B"

                println("\nCinema:")
                print("  ")
                for (i in 1..seats) {
                    print("$i ")
                }
                println()
                for (i in 0 until rows) {
                    print("${i + 1} ")
                    for (j in 0 until seats) {
                        print("${cinema[i][j]} ")
                    }
                    println()
                }
            }
            0 -> return
            else -> println("Invalid option. Please try again.")
        }
    }
}


const val NORMAL_PRICE = 10
const val BACKSEAT_PRICE = 8
const val NUMBER_OF_SEATS_IN_LARGER_ROOM = 60
const val MENU = """
1. Show the seats
2. Buy a ticket
0. Exit"""

fun main() {
    println("Enter the number of rows:")
    val rows: Int = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seats: Int = readLine()!!.toInt()
    val seatingChart = MutableList(rows) { MutableList(seats) { 'S' } }

    menu(seatingChart)
}

fun menu(chart: MutableList<MutableList<Char>>) {
    while (true) {
        println(MENU)
        when (readLine()!!) {
            "1" -> displaySeats(chart)
            "2" -> buyTicket(chart)
            "0" -> break
        }
    }
}

fun displaySeats(chart: MutableList<MutableList<Char>>) {
    println("\nCinema:")
    print(" ")
    for (i in 1 .. chart[0].size) {
        print(" $i")
    }
    println()
    for (row in 0 .. chart.lastIndex) {
        println("${row + 1} ${chart[row].joinToString(" ")}")
    }
}

fun buyTicket(chart: MutableList<MutableList<Char>>) {
    println("\nEnter a row number:")
    val row = readLine()!!.toInt()
    println("Enter a seat number in that row:")
    val seatNumber = readLine()!!.toInt()
    println("Ticket price: $${calcTicketPrice(row, seatNumber, chart)}")
}

fun calcTicketPrice(row: Int, seat: Int, chart: MutableList<MutableList<Char>>): Int {
    chart[row - 1][seat - 1] = 'B'

    return if (chart.size * chart[0].size < NUMBER_OF_SEATS_IN_LARGER_ROOM || row <= chart.size / 2) {
        NORMAL_PRICE
    } else {
        BACKSEAT_PRICE
    }
}

