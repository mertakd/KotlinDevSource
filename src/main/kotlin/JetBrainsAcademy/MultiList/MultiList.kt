package JetBrainsAcademy.MultiList

fun main1() {


    //2 satır, 3 sütun
    val mutList2D = mutableListOf(
        mutableListOf<Int>(0, 1, 2),   //[0]
        mutableListOf<Int>(3, 4, 5)    //[1]
    )

    println(mutList2D[0][0])	// 0  //ilk satırın ilk elementi demek



    print(mutList2D[0][0])  // 0  ilk satır, ilk sütün
    print(mutList2D[0][1])  // 1  ilk satır ikinci sütun
    print(mutList2D[0][2])  // 2
    print(mutList2D[1][0])  // 3  ikinci satır ilk sütun
    print(mutList2D[1][1])  // 4
    print(mutList2D[1][2])  // 5


}


fun main2() {


    //oluşturulabilecek listeler string, char, ya da karma.
    val mutListOfString2D = mutableListOf(
        mutableListOf<String>("to", "be", "or"),
        mutableListOf<String>("not", "to", "be")
    )



    val mutListOfChar2D = mutableListOf(
        mutableListOf<Char>('A', 'R', 'R'),
        mutableListOf<Char>('A', 'Y', 'S')
    )




    val mutListOfStringAndInt2D = mutableListOf(
        mutableListOf<String>("Practice", "makes", "perfect"),
        mutableListOf<Int>(1, 2)
    )
}


fun main3() {

    val mutListString = mutableListOf(
        mutableListOf<String>("A", "R", "R", "A", "Y")
    )
    print(mutListString[0].joinToString())    // A, R, R, A, Y




    val mutListOfChar2D = mutableListOf(
        mutableListOf<Char>('k'),
        mutableListOf<Char>('o', 't'),
        mutableListOf<Char>('l', 'i', 'n'))

    println(mutListOfChar2D)	// [[k], [o, t], [l, i, n]]
}


fun main4() {

    //3 boyutlu listeler

    val mutList3D = mutableListOf(

        mutableListOf(mutableListOf<Int>(0,1), mutableListOf<Int>(2,3)),

        mutableListOf(mutableListOf<Int>(4,5), mutableListOf<Int>(6,7))
    )

    println(mutList3D)  // [[[0, 1], [2, 3]], [[4, 5], [6, 7]]]


    println(mutList3D[0][0][1])   // 1
    println(mutList3D[1][0][1])   // 5
    println(mutList3D[1][1][1])   // 7
}



//QUİZ

fun main() {

    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val stringsList = readLine()!!.split(' ').toMutableList()
        inputList.add(stringsList)
    }

    // Get the third row as a string with elements separated by a comma and space
    val thirdRow = inputList[2].joinToString(", ")

    println(thirdRow)


}