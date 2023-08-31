package JetBrainsAcademy.Classes.Generics.BasicGenerics



class Pair<T, P>(var first: T, var second: P) {
    fun changeFirst(newValue: T) {
        first = newValue
    }

    fun changeSecond(newValue: P) {
        second = newValue
    }

    fun printData() {
        println("Values:")
        println("first = $first")
        println("second = $second")
    }
}


fun main1() {

    val nameLastname: Pair<String,String> = Pair("John","Smith")
    val nameAge: Pair<String, Int> = Pair("Kite",18)

    nameAge.changeFirst("Mert")
    nameAge.changeSecond(29)

    nameLastname.printData()

    nameAge.printData()


}


class RandomCollection<T>(val items: List<T>) {
    fun get(index: Int): T {
        return items[index]
    }

    fun length(): Int {
        return items.size
    }
}


fun main() {

    var nums = RandomCollection(listOf(10, 25, 32, 4))

    for (i in 0 until nums.length()) {
        print("${nums.get(i)} ") // "1 2 3 4 "
    }
}

