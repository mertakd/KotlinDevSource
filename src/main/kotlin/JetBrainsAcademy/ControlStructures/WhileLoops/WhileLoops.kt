package JetBrainsAcademy.ControlStructures.WhileLoops

import java.util.*

/*
* While döngüsü bir kod bloğu ve bir boolean ifadesi olan bir koşul içerir
* Koşul doğruysa döngü deyimleri(statements) başlatır.Koşul yanlış olana kadar tekrarlanırlar
* Bu döngü, yürütme öncesinde durumu kontrol eder, dolayısıyla ön test döngüsü olarak da bilinir.*/

fun main99() {
    var i = 0

    while (i < 5) {
        println(i)
        i++
    }

    println("Completed")
}




//unicode ile arttırır harfleri
fun main98() {
    var letter = 'A'

    while (letter <= 'Z') {
        print(letter)
        letter++
    }
}


fun main97() {
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val next = scanner.next()
        println(next)
    }
}






// DO-WHILE
/*
* Önce do...while döngüsü çalıştırılır, ardından program bir koşulu test eder.
* Koşul doğruysa koşul yanlış olana kadar döngüyü tekrarlar.
* do...while döngüleri yürütme sonrasında koşulu kontrol ettiğinden, döngü aynı zamanda test sonrası döngü(post-test loop) olarak da bilinir.
* Çalıştırılmadan önce koşulu test eden while döngüsünün aksine, do..while döngüsü bir çıkış koşulu döngüsüdür.Yani vücut her zaman en az bir kez idam edilir.*/

fun main() {
    do {
        val n = readln().toInt()
        println(n)
    } while (n > 0)
}



//Bir while döngüsü, gövde çalıştırılmadan önce bir koşulu kontrol eder, do...while döngüsü ise ilk çalıştırmadan sonra onu kontrol eder.
//Pratikte programcılar do..while ifadesini while kadar sık ​​kullanmazlar.
//Bu döngüyü kullanmanın iyi bir örneği, kullanıcı belirli bir sayıyı veya dizeyi girene kadar standart girişten veri okuyan bir programdır.



