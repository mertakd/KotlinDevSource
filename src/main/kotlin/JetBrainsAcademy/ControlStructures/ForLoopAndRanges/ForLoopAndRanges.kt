package JetBrainsAcademy.ControlStructures.ForLoopAndRanges



//Çoğu zaman bazı eylemleri tekrar tekrar yapmanız gerekir. Örneğin 1'den 100'e kadar olan sayıların toplamını (formülsüz) bulmak istiyorsanız sayıları sırayla eklemeniz gerekir.
//Bunu yapmak için zaten aşina olduğunuz for döngüsünü ve aralıklarını kullanabilirsiniz. Gelin buna daha yakından bakalım!


fun main99() {
    //Iterating through a range
    for (i in 1..4) {
        println(i)
    }

    //karakter ile yenileme
    for (ch in 'a'..'c') {
        println(ch)
    }




    //Iterating through a String
    println("Iterating through a String")
    val str = "Hello!"
    for (ch in str) {
        println(ch)
    }


    //Iterating in the backward order
    println("Iterating in the backward order")
    for (i in 4 downTo 1) {
        println(i)
    }


    //üst limit until
    //Bir aralığın üst sınırını hariç tutmamız gerekirse, bu aralıktan bir tane çıkarabilir veya yerine kadar yazabiliriz.
    println("üst limit until")
    for (i in 1 until 4) {
        println(i) // 1 2 3
    }



    //step
    println("step")
    for (i in 1..7 step 2) {
        println(i)
    }
    //1
    //3
    //5
    //7

    //geriye doğru step
    println("geriye doğru step")
    for (i in 7 downTo 1 step 2) {
        println(i)
    }
}




// örnek faktoriyel hesaplama
fun main98() {
    val n = readln().toInt()
    var result = 1 // starting value of the factorial

    for (i in 2..n) { // the product from 2 to n
        result *= i
    }

    println(result)
}




//çift sayıların çarpım tablosu
fun main97() {
    for (i in 2..10 step 2) {
        for (j in 2..10 step 2) {
            print(i * j)
            print('\t')  // print the product of i and j followed by one tab
        }
        println()
    }
}



//idiom
fun main() {
    for (i in 1..6) {  }        // closed range: 1, 2, 3, 4, 5, 6
    for (i in 1 until 6) {  }   // half-open range: 1, 2, 3, 4, 5
    for (x in 1..6 step 2) {  } // step 2: 1, 3, 5
    for (x in 6 downTo 1) {  }  // closed range, backward order: 6, 5, 4, 3, 2, 1
}




