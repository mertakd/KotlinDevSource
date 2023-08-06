package JetBrainsAcademy.Arrays

/**
 * ilk elementin, index i 0 dır ve array size -1 ile erişilir.
 * */


fun main() {



    val numbers = intArrayOf(1, 2, 3, 4, 5) // It stores 5 elements of the Int type
    println(numbers.joinToString()) // 1, 2, 3, 4, 5

    val characters = charArrayOf('K', 't', 'l') // It stores 3 elements of the Char type
    println(characters.joinToString()) // K, t, l

    val doubles = doubleArrayOf(1.25, 0.17, 0.4) // It stores 3 elements of the Double type
    println(doubles.joinToString()) // 1.25, 0.17, 0.4

    //joinToString() işlevi, bir diziyi bir dizgeye dönüştürür.




    println("Belirtilen boyutta bir dizi oluşturma")
    val numbers2 = IntArray(5) // an array of 5 integer numbers
    println(numbers2.joinToString())

    val doubles2 = DoubleArray(7) // an array of 7 doubles
    println(doubles2.joinToString())


    //You cannot change the size of an array, but you can modify the elements.
}