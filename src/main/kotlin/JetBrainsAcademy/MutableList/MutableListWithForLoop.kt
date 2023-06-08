package JetBrainsAcademy.MutableList

fun main1() {

    //indices :  listenin indexleri alınıyor
    val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

    for (index in daysOfWeek.indices){
        println("$index: ${daysOfWeek[index]}")
    }

}




fun main2() {

    //1 ve 5.index e kadar alıyor(1 ve 5 dahil)
    val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

    for (index in 1..5) {
        println("$index: ${daysOfWeek[index]}")
    }



    //son index dahil değil
    for (index in 1 until daysOfWeek.lastIndex) {
        println("$index: ${daysOfWeek[index]}")
    }
    //2.element den başlıyor ve son elementi de almadan bitiriyor
}





fun main3() {

    //6 ve 0 sıfır dahil geriye 2 şer şekilde gidiyor
    val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

    for (index in daysOfWeek.lastIndex downTo 0 step 2) {
        println("$index: ${daysOfWeek[index]}")
    }
    //6: Sat
    //4: Thur
    //2: Tues
    //0: Sun
}


fun main4() {

    //mutable list e input vermek. verilen sayılar geriye doğru çıktı verir.

    val getSize = readln().toInt()
    val mutList: MutableList<Int> = mutableListOf()
    for (i in 0 until getSize) {
        mutList.add(readln().toInt())
    }

    for (i in mutList.lastIndex downTo 0) {
        print("${mutList[i]} ")
    }

    //çıktı -> 5 4 3 2 1
}


fun main5a() {

    val inputSize = readln().toInt()
    val list: MutableList<Int> = mutableListOf()

    for (i in 0 until inputSize) {
        list.add(readln().toInt())
    }

    var maxIndex = 0
    for (i in 1 until list.size) {
        if (list[i] > list[maxIndex]) {
            maxIndex = i
        }
    }

    println(maxIndex) //cevap 2 =   2.index, 3.element = değeri 8
}


fun main5b() {

    val mList = MutableList(readln().toInt()) { readln().toInt() }

    println("${mList.indexOf(mList.maxOrNull())}")

    //Bu kod, kullanıcıdan bir sayı girişi alarak bir liste oluşturur. İlk satırda readln().toInt() ifadesi ile bir tamsayı alınır ve bu tamsayı MutableList'in boyutunu belirler. Ardından, her bir satırda readln().toInt() ifadesi kullanılarak kullanıcıdan tamsayılar alınır ve bu tamsayılar oluşturulan mList adlı liste içine eklenir.
    //Sonra, mList.indexOf(mList.maxOrNull()) ifadesi kullanılarak mList listesinin maksimum değerinin indeksi bulunur. maxOrNull() fonksiyonu ile mList listesindeki en büyük değer elde edilir. indexOf() fonksiyonu ise bu en büyük değerin ilk bulunduğu indeksi döndürür.

}

fun main5c() {
    val n = readln().toInt()
    val list = MutableList(n) { readln().toInt() }
    var x = 0

    for (i in 0 until n) {
        if (list[i] > list[x]) {
            x = i
        }

    }
    println(x)
}


fun main() {

    //verdiğin sayı listede var mı?
    val n = readLine()!!.toInt()
    val set = mutableSetOf<Int>()

    for (i in 1..n) {
        set.add(readLine()!!.toInt())
    }

    val m = readLine()!!.toInt()

    val result = if (m in set) "YES" else "NO"
    println(result)
}


