package JetBrainsAcademy.Classes.Object.CompanionObject

//quiz 1
class Player2(val id: Int, val name: String) {
    companion object {
        var role = "playable character"

    }

    fun getInfo() = "$id, $name, $role"
}

fun getPlayerInfo(player: Player2) = player.getInfo()




//quiz 2

data class Player3(val id: Int, val name: String, val speed: Int, val health: Int, val armor: Int) {

    companion object Properties {
        const val baseSpeed = 7
        const val baseHealth = 100
        const val baseArmor = 100
        const val maxSpeed = 13
        const val maxHealth = 140
        const val maxArmor = 100
    }
}


fun main1() {
    val player = Player3(1,"mert",210,100,87)

    val player2 = Player3.baseSpeed
}



class Player5(val id: Int, name: String) {
    companion object {
        val defaultSpeed = 8
        val maxSpeed = 13

        fun calcMovePenalty(cell: Int): Int {
            return defaultSpeed - cell % 3
        }
    }
}

fun calculatePlayerSpeed(cell: Int): Int {
    return Player5.calcMovePenalty(cell)
}


fun main() {
    val cell = 10
    val movePenalty = Player5.calcMovePenalty(cell)
    val speed = calculatePlayerSpeed(cell)
    println(movePenalty)
    println(speed)
}

