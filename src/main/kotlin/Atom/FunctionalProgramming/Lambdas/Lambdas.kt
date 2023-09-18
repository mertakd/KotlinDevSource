package JetBrainsAcademy.Projects.CoffeeMachine.Atom.FunctionalProgramming.Lambdas

/*
*  Map() parametresi, bir koleksiyondaki her öğeye(element) uygulanan bir dönüştürme işlevidir. Map(), dönüştürülen tüm öğeleri içeren yeni bir Liste döndürür. Burada her Liste öğesini [] ile çevrelenmiş bir String'e dönüştürüyoruz.*/


// normal yazım
fun main1a() {
    val list = listOf(1, 2, 3, 4)
    val result = list.map { n: Int -> "[$n]" }
    println(result)
}

//tür çıkarımı
fun main1b() {
    val list = listOf(1, 2, 3, 4)
    val result = list.map { n -> "[$n]" }

}



//tek parametre varsa it kullanılabilir.
fun main1c() {
    val list = listOf(1, 2, 3, 4)
    val result = list.map { "[$it]" }

}



// it ve char ile kullanımı
fun main1d() {
    val list = listOf('a', 'b', 'c', 'd')
    val result =
        list.map { "[${it.uppercaseChar()}]" }
    println(result)
}




fun main1e() {
    val list = listOf(9, 11, 23, 32)
    list.joinToString(" ") { "[$it]" }

}



fun main1f() {
    val list = listOf(9, 11, 23, 32)
    list.joinToString(
        separator = " ",
        transform = { "[$it]" }
    )
    println(list)
}



fun main1g() {
    val list = listOf('a', 'b', 'c')
    val result = list.mapIndexed { index, element ->
        "[$index: $element]"
    }
    println(result)
    //listOf("[0: a]", "[1: b]", "[2: c]")
}



fun main1h() {
    val list = listOf('a', 'b', 'c')
    val result = list.mapIndexed { index, _ ->
        "[$index]"
    }
    println(result)
    //listOf("[0]", "[1]", "[2]")
}


fun main1I() {
    val list = listOf('a', 'b', 'c')
    val result = list.indices.map {
        "$it"
    }
    println(result)
}








//  The Importance of Lambdas

fun filterEven(nums: List<Int>): List<Int>{

    val result = mutableListOf<Int>()
    for (i in nums){
        if (i % 2 == 0){
            result += i
        }
    }
    return result
}
fun main1() {
    val result = filterEven(listOf(1, 2, 3, 4))
    println(result)
}







fun greaterThan2(nums: List<Int>): List<Int>{
    val result = mutableListOf<Int>()
    for (i in nums){
        if (i > 2){
            result += i
        }
    }
    return result
}

fun main2() {
    greaterThan2(listOf(1,2,3,4))   // 3, 4
}



// filter ile kısa yolu
fun main3() {
    val list = listOf(1 ,2, 3, 4)
    val even = list.filter { it % 2 == 0 }
    val greaterThan2 = list.filter { it > 2 }
}



// lambda ları var ya da var da saklayabiliriz.
fun main4() {
    val list = listOf(1,2,3,4)
    val isEven = {e: Int -> e % 2 == 0}
    list.filter(isEven) //2,4
    list.any(isEven)    // true
}


fun main5() {
    val list = listOf(1, 5, 7, 10)
    var sum = 0
    val divider = 5
    list.filter { it % divider == 0 }
        .forEach { sum += it }

}


fun main6() {
    val list = listOf(1,5,7,10)
    val divider = 5
    list.filter { it % divider == 0  }
        .sum() // 15
}









//Operations on Collections
//liste başlatmak
fun main7() {

    val list1 = List(10) {it}
    println(list1) //"[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]"

    // A list of a single value:
    val list2 = List(10) { 0 }
    //"[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]"

    // A list of letters:
    val list3 = List(10) { 'a' + it }
    // "[a, b, c, d, e, f, g, h, i, j]"

    // Cycle through a sequence:
    val list4 = List(10) { list3[it % 3] }
    // "[a, b, c, a, b, c, a, b, c, a]"
}








fun main8() {
    val mutableList1 =
        MutableList(5, { 10 * (it + 1) })
    // "[10, 20, 30, 40, 50]"

    val mutableList2 =
        MutableList(5) { 10 * (it + 1) }
    // "[10, 20, 30, 40, 50]"
}


fun main9() {

    val list = listOf(-3, -1, 5, 7, 10)

    list.filter{it > 0}  //listOf(5, 7, 10)
    list.count{it > 0} // 3

    list.find { it > 0 } //eq 5
    list.firstOrNull { it > 0 } //eq 5
    list.lastOrNull { it < 0 } //eq -1
    list.any { it > 0 } //eq true
    list.any { it != 0 } //eq true
    list.all { it > 0 } //eq false
    list.all { it != 0 } //eq true
    list.none { it > 0 } //eq false
    list.none { it == 0 } //eq true

    //filter() ve count() yüklemi her öğeye uygularken any() veya find() ilk eşleşen sonuç bulunduğunda durur. Örneğin, ilk öğe yüklemi karşılıyorsa, any() hemen doğruyu döndürürken find() ilk eşleşen öğeyi döndürür.

}




//partion: hem pozitifleri hem negatif durumları gösterir.
fun main10() {
    val list = listOf(-3, -1, 5, 7, 10)
    val isPositive = { i: Int -> i > 0}

    list.filter(isPositive) //"[5, 7, 10]"
    list.filterNot(isPositive) //"[-3, -1]"

    val (pos, neg) = list.partition{it > 0}
    //"[5, 7, 10]"
    // "[-3, -1]"
}



// pair
fun createPair() = Pair(1, "one")
fun main11() {
    val (i, s) = createPair()
    println(createPair())
}




//filterNotNull(), boş değerlerin kaldırıldığı yeni bir Liste üretir:
fun main12() {
    val list = listOf(1, 2, null)
    list.filterNotNull() //eq "[1, 2]"
}





data class Product(
    val description: String,
    val price: Double
)


fun main13() {

    val products = listOf(
        Product("bread",2.0),
        Product("wine",5.0)
    )
    products.sumByDouble { it.price } // 7.0

    products.sortedByDescending { it.price }  //"[Product(description=wine, price=5.0)," +
                                               //" Product(description=bread, price=2.0)]"

    products.minByOrNull { it.price }  // Product("bread", 2.0)
}




fun main14() {
    val list = listOf('a', 'b', 'c', 'X', 'Z')
    list.takeLast(3) //eq "[c, X, Z]"
    list.takeLastWhile { it.isUpperCase() } // "[X, Z]"
    list.drop(1) //eq "[b, c, X, Z]"
    list.dropWhile { it.isLowerCase() } // "[X, Z]"
}




fun main15() {
    val set = setOf("a", "ab", "ac")
    set.maxByOrNull { it.length }?.length //eq 2
    set.filter {
        it.contains('b')
    } //eq listOf("ab")
    set.map { it.length } //eq listOf(1, 2, 2)
}








//Member References
data class Message(
    val sender: String,
    val text: String,
    val isRead: Boolean
)


fun main16() {

    val messages = listOf(
        Message("Kitty","Hey!", true),
        Message("Kitty", "Where are you?", false)
    )

    val unread = messages.filterNot(Message::isRead)
    unread.size
    unread.single().text

}


fun main17() {

    val messages = listOf(
        Message("Kitty","Hey!",true),
        Message("Kitty","Where are you?",false),
        Message("Boss","Meeting today", false)
    )

    messages.sortedWith(compareBy(
        Message::isRead, Message::sender
    ))
}






//Function References
data class Message2(
    val sender: String,
    val text: String,
    val isRead: Boolean,
    val attachments: List<Attachment>
)
data class Attachment(
    val type: String,
    val name: String
)
fun Message2.isImportant(): Boolean =
    text.contains("Salary increase") ||
            attachments.any {
                it.type == "image" &&
                        it.name.contains("cat")
            }
fun main() {
    val messages = listOf(Message2(
        "Boss", "Let's discuss goals " +
                "for next year", false,
        listOf(Attachment("image", "cute cats"))))
    messages.any(Message2::isImportant) //eq true
}



