package JetBrainsAcademy.Andromeda

fun main() {

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)

    println("for")
    for(i in numbers.indices){
        println(numbers[i])
    }




    println("for uzun hali")
    for (i in  0 until  numbers.size){
        println(numbers[i])
    }
    //yukarıda ki for un uzun hali



    println("for each ile yazmak")
    numbers.forEach {
        println(it)
    }
    //for döngüsü genellikle indeksleri veya sayıları kullanarak dizi elemanlarına erişmek için kullanılırken, forEach döngüsü daha çok koleksiyon üzerinde elemanlara erişmek ve işlemler gerçekleştirmek için tercih edilir.


    println("forEachIndexed")
    numbers.forEachIndexed{ index, element ->
        println("index:$index  element:$element")
    }




///vararg arka planda nasıl çalışır?
}