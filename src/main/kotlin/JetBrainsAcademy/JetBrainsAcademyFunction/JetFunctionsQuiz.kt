package JetBrainsAcademy.JetBrainsAcademyFunction

fun main() {

    /*val a = readLine()!!.toInt()
    println(getLastDigit(a))*/



   /* val letter = readLine()!!.first()
    println(isVowel(letter))*/
}



/*//*
/girilen son rakamı çıktı ver.
*  math.abs negatifi pozitif yapıyor mutlak sayı
* negatif üç basamaklı bir sayı girdik *//*

fun getLastDigit(number: Int): Int {
    return Math.abs(number) % 10
}

//başka çözüm : fun getLastDigit(digit: Int) = digit.toString().last()*/

 */





/**
 * Soru2: verilen input sesli mi
 * in verilen input değişkenle uyuşuyorsa true verir aksi halde false verir
 * first yazılan kelimenin ilk harfini alır.



fun isVowel(letter: Char): Boolean {
    val vowels = "aeiouAEIOU"
    return letter in vowels
}
 */




/**
 * soru
 * sayının karesini bul
fun square(n: Int) = n * n


fun main() {
    val number = readLine()!!.toInt()
    println(square(number))
}*/
