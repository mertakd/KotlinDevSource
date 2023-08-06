package JetBrainsAcademy.Arrays

/**
 * ilk elementin, index i 0 dır ve array size -1 ile erişilir.
 * */


fun main1() {



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




    println("değişik şeyler")

    val numbers3 = IntArray(10) { i -> i + 1 }
    println("Numbers: ${numbers3.joinToString()}")
    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    val onlyOne = IntArray(10) { 1 }
    println("Only 1: ${onlyOne.joinToString()}")
    // 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
    val onlyMinusOne = IntArray(10).apply { fill(-1) }
    println("Only -1: ${onlyMinusOne.joinToString()}")
    // -1, -1, -1, -1, -1, -1, -1, -1, -1, -1





    println("array input")
    val numbers6 = arrayOf(5) // on each line single numbers from 1 to 5
    println(numbers6.joinToString()) // 1, 2, 3, 4, 5



    println("single line")
    val numbers7 = readln().split(" ").map { it.toInt() }.toTypedArray()
    println(numbers7.joinToString())



    println("arama larda ki logic")
    val regex = "\\s+".toRegex()
    val str = "1 2\t\t3  4\t5  6"
    val nums = str.split(regex).map { it.toInt() }.toTypedArray()
    println(nums.joinToString()) // 1, 2, 3, 4, 5, 6


}


fun main() {
    //Array size
    //Dizi oluşturulduktan sonra boyutunu değiştiremezsiniz.
    //bir dizi indexlerle erişilebilen, elementler koleksiyonudur.
    //ilk index 0 dır.
    //bir array in her zaman size ı vardır

    val numbers22 = intArrayOf(1, 2, 3, 4, 5)
    println(numbers22.size) // 5




    //Accessing elements
    //You can change the values of array elements. Use the index to set a value in the array.
    val numbers = IntArray(3) // numbers: 0, 0, 0

    numbers[0] = 1 // numbers: 1, 0, 0
    numbers[1] = 2 // numbers: 1, 2, 0
    numbers[2] = numbers[0] + numbers[1] // numbers: 1, 2, 3

    println(numbers[0]) // 1, the first element
    println(numbers[2]) // 3, the last element



    val alphabet = charArrayOf('a', 'b', 'c', 'd')

    val last = alphabet[alphabet.size - 1]    // 'd'
    val prelast = alphabet[alphabet.size - 2] // 'c'

    println(alphabet.first())   // 'a'
    println(alphabet.last())    // 'd'
    println(alphabet.lastIndex) // 3





    println("Comparing arrays")
    val numbers1 = intArrayOf(1, 2, 3, 4)
    val numbers2 = intArrayOf(1, 2, 3, 4)
    val numbers3 = intArrayOf(1, 2, 3)

    println(numbers1.contentEquals(numbers2)) // true
    println(numbers1.contentEquals(numbers3)) // false



    //nesne karşılaştırma
    val simpleArray = intArrayOf(1, 2, 3, 4)
    val similarArray = intArrayOf(1, 2, 3, 4)

    println(simpleArray == simpleArray)  // true, simpleArray points to the same object
    println(simpleArray == similarArray) // false, similarArray points to another object

}