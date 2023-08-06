package JetBrainsAcademy.Arrays

fun main11() {
    //Initialization
    //Temel olarak, arrayOf işlevi evrenseldir: onu, String dahil olmak üzere bir dizideki her tür veriyi toplamak için kullanabilirsiniz.
    val stringArray = arrayOf("array", "of", "strings")



    //Daha sonra dizelerle doldurulacak boş bir dizi de başlatabilirsiniz. Bunun için emptyArray işlevine ihtiyacınız var:
    val newEmptyArray = emptyArray<String>()



    println("Accessing elements")
    //Accessing elements
    val stringArray2 = arrayOf("sagacity", "and", "bravery")
    println(stringArray2[2])   // bravery

    stringArray2[0] = "smart"
    println(stringArray2[0])   // smart
    println(stringArray2[stringArray2.size-1])

    val southernCross = arrayOf("Acrux", "Gacrux", "Imai", "Mimosa")
    println(southernCross.joinToString())   //  Acrux, Gacrux, Imai, Mimosa
    //joinToString() olmadan yazdırmıyor



}


fun main22() {

    //Working with multiple arrays
    val southernCross = arrayOf("Acrux", "Gacrux", "Imai", "Mimosa")
    val stars = arrayOf("Ginan", "Mu Crucis")

    val newArray = southernCross + stars
    println(newArray.joinToString())    //  Acrux, Gacrux, Imai, Mimosa, Ginan, Mu Crucis



    //compare
    val firstArray = arrayOf("result", "is", "true")
    val secondArray = arrayOf("result", "is", "true")
    val thirdArray = arrayOf("result")

    println(firstArray.contentEquals(secondArray))  //  true
    println(firstArray.contentEquals(thirdArray))   //  false



    //Changing the array contents
    //İster val ister var kullanıyor olun, varolan öğelerin değerlerini dizinleri aracılığıyla düzenleyebilirsiniz:
    val southernCross2 = arrayOf("Acrux", "Gacrux", "Imai", "Mimosa")
    var stars2 = arrayOf("Ginan", "Mu Crucis")
    southernCross[1] = "star"
    stars[1] = "star"

    println(southernCross2[1]) // star
    println(stars2[1]) // star




    //Ancak, yeniden atama söz konusu olduğunda val ve var arasında büyük bir fark vardır. Bir var diziniz olduğunda, ona yeni öğeler ekleyerek değiştirebilirsiniz.
    var southernCross4 = emptyArray<String>()
    southernCross4 += "Acrux"
    southernCross4 += "Gacrux"
    southernCross4 += "Imai"
    println(southernCross4.joinToString())   // Acrux, Gacrux, Imai

    //Diziniz başlangıçta boş olmasa bile öğeleri aynı şekilde ekleyebilirsiniz:
    var southernCross5 = arrayOf("Acrux", "Gacrux", "Imai")
    southernCross5 += "Mimosa"
    println(southernCross5.joinToString())  //  Acrux, Gacrux, Imai, Mimosa
    //Kotlin'de diziler bir bakıma değiştirilemez. Dizi var ile bildirilse bile gerçekten düzenlenemez. Her iki örnekte de, SouthernCross dizisi gerçekte yeniden yaratılmıştır.
    //Aslında, diziyi tam anlamıyla sildik ve onun yerine başka bir dizi oluşturduk.
    //Böylece, dizi var olarak bildirilirse yeni öğeler ekleyebiliriz. Val kullanıyorsanız, bu mümkün değildir:
    val southernCross7 = arrayOf("Acrux", "Gacrux", "Imai", "Mimosa")
    //southernCross7 += "Ginan" // will not compile

}


fun main() {
    //QUIZ

    val beyondTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    //SPLİT virgül koymamızı sağlıyor input da.

    val isOnPatrol = beyondTheWall.contentEquals(backFromTheWall)
    println(isOnPatrol)








    var backFromTheWall2 = readLine()!!.split(',').map { it }.toTypedArray()
    val returnedWatchman = readLine()!!.toString()
    // do not touch the lines above
    // write your code here
    // Add the returnedWatchman to the backFromTheWall array
    backFromTheWall2 += returnedWatchman

    // Print the updated backFromTheWall array with joinToString()
    println(backFromTheWall2.joinToString(", "))
}