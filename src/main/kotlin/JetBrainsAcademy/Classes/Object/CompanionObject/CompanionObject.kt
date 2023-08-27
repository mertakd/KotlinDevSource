package JetBrainsAcademy.Classes.Object.CompanionObject


//Bir sınıfın tüm örnekleri için ortak bir şeye ihtiyacınız varsa companion object kullanabilirsiniz:
class Player(val id: Int) {
    /*companion object Properties {
        *//* Default player speed in playing field - 7 cells per turn *//*
        val defaultSpeed = 7

        fun calcMovePenalty(cell: Int): Int {
           return cell
        }
    }*/

    companion object {
        /* Default player speed in playing field - 7 cells per turn */
        val defaultSpeed = 7

        fun calcMovePenalty(cell: Int): Int {
            return cell
        }
    }
}



class Player32(val id: Int, val name: String, val hp: Int) {
    companion object {
        private var uniqueIdCounter = 0

        fun create(name: String): Player32 {
            val playerId = uniqueIdCounter++
            return Player32(playerId, name, 100)
        }
    }
}




fun main() {

    /* prints 7 */
    //println(Player.Properties.defaultSpeed)
    println(Player.defaultSpeed)
    println(Player.Companion.defaultSpeed)
}



//dış sınıfta companion object özellikleri ve fonksiyonlarını kullanabiliriz isimsiz bir şekilde.
class Deck {


    companion object {
        val size = 10
        val height = 2
        fun volume(bottom: Int, height: Int) = bottom * height
    }

    val square = size * size             //100
    val volume = volume(square, height)  //200
}





class Deck2() {
    val size = 2
    object Properties {
        //val defaultSize = size // you cannot get this variable
    }
}



//her sınıfta bir tane companion object olur. aşağıda ki örnek hata veriyor.
/*
class BadClass {
    companion object Properties {

    }

    companion object Factory {

    }
}
*/



//Ancak, bir tamamlayıcı nesne ve birkaç iç içe geçmiş nesne oluşturabiliriz:
class Player33(val id: Int) {
    companion object Properties {
        /* Default player speed in playing field - 7 cells per turn */
        val defaultSpeed = 7

        fun calcMovePenalty(cell: Int): Int {
            return cell
        }
    }

    /* creates a new instance of Player */
    object Factory {
        fun create(playerId: Int): Player {
            return Player(playerId)
        }
    }
}

//object içinde companion olamaz






