package JetBrainsAcademy.ControlStructures.JumpsAndReturns

import java.util.*

//Quiz 1
//Hangi anahtar kelime aynı anda hem döngüden hem de fonksiyondan atlamayı sağlar?  -> return



//Quiz2
//Continue hakkındaki tüm gerçek
//Etiket sayesinde iç döngüden çıkış imkanı sağlar.
//Bir koşulu kullanarak döngünün mevcut yinelemesini atlamamızı sağlar.






//Quiz 3       Beyond the word
fun main3a() {
    val input = Scanner(System.`in`)
    val word = input.next()

    for (letter in 'a'..'z'){
        if (letter in word) continue
        print(letter)
    }
}
fun main3b() {
    val word = readLine()?.toLowerCase()
    val alphabet = "abcdefghijklmnopqrstuvwxyz"

    val missingLetters = buildString {
        loop@ for (letter in alphabet) {
            for (char in word ?: "") {
                if (char == letter) {
                    continue@loop
                }
            }
            append(letter)
        }
    }

    println(missingLetters)
}

fun main3c() {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val word = readLine()!!
    loop@ for (i in alphabet) {
        for (j in word) {
            if (i == j) {
                continue@loop
            }
        }
        print(i)
    }
}





// Quiz 4      First digit
fun main4a() {

    for (ch in readln()){
        if (ch in '0'..'9'){
            print(ch)
            break
        }
    }
}
fun main4b() = print(readLine()!!.first { it.isDigit() })
fun main4c(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x = scanner.next()
    for (i in x) {
        if (i.isDigit()) {
            print(i)
            break
        }
    }
}
fun main4d() {
    val str = readln()
    for (i in str) {
        if (i.isDigit()) { println(i); break }
    }
}
fun main4e() {
    // put your code here
    val myString = readln()
    val myList = mutableListOf<Char>()

    for (ch in myString) {
        if (ch.code in 48..57) {
            myList.add(ch)
        }
    }
    println(myList[0])
}
fun main4f() = readLine()!!.first(Char::isDigit).let(::print)
fun main4g() = println(readLine()!!.toCharArray().find { it in '0'..'9' })
fun main4h() {
    val input = Scanner(System.`in`)
    input.next().forEach { if (it.isDigit()) { print(it); return } }
}









// Quiz 4
// Kotlinde ki  jump expressions seçin
// break, continue, return




// Quiz 5        Break keyword with label
fun main5() {

    for (i in 1..4) {
        loop@ for (j in 1..3) {
            for (k in 1..2) {
                if (i == 2 || j == 3 || k == 2) break@loop
                print("$k") //111
            }
        }
    }
}





// Quiz6
fun printPrecedingAlphabetLetters(letter: Char) {
    for (currentLetter in 'a' until letter) {
        print(currentLetter)
    }
}

fun main6a() {

    val inputLetter = readLine()?.trim()?.firstOrNull()

    if (inputLetter != null && inputLetter in 'a'..'z') {
        printPrecedingAlphabetLetters(inputLetter)
    } else {
        println("Invalid input. Please enter a valid lowercase letter.")
    }
}

fun main6b() {
    val scanner = Scanner(System.`in`)
    val stopLetter = scanner.next().first()

    for (letter in 'a'..'z'){
        if (letter == stopLetter) return
        print(letter)
    }
}
fun main6c() {
    val str = "abcdefghijklmnopqrstuvwxyz"
    val a = readln()
    for (i in str) { if (a == i.toString()) break; print(i) }
}
fun main6d(args: Array<String>) {

    ('a' until System.`in`.read().toChar()).forEach { print(it) }
}
fun main6e() {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val letter = readLine()!!
    for (i in alphabet) {
        if (i == letter[0]) break
        print(i)
    }
}










//Quiz 7
fun main7() {

    for (i in 1..3) {
        if (i == 1)
            continue
        print(1)
        loop@ for (j in 1..2) {
            for (k in 1..2) {
                if (i == 2 || j == 3) break@loop
                print(2)
            }
            if (j == 1) return
            print(3)
        }
    }
}





// Quiz 8
fun main8a() {
    val scanner = Scanner(System.`in`)
    val word = scanner.next()
    var unique = 0
    dup@ for (i in word.indices) {
        for (j in word.indices) {
            if (i == j) continue
            if (word[i] == word[j]) continue@dup
        }
        unique++
    }
    println(unique)
}
fun main8b() {
    val scanner = Scanner(System.`in`)
    println(scanner.next().toList().groupBy { it }.filterValues { it.size == 1 }.size)
}
fun main8c() {
    val str = readLine()!!.toLowerCase()
    var answer = 0
    for (element in str) {
        val ls = str.split("$element").toList()
        if (ls.lastIndex == 1) {
            answer++
        } else continue
    }
    print(answer)
}
fun main8d() {
    val x = readLine()!!
    var s = 0
    x.forEach { char ->
        if (x.indexOf(char) == x.lastIndexOf(char)) s++
    }
    print(s)
}
fun main8e() {
    val text = readLine()!!
    var cont = 0
    for (i in text) {
        if (text.lastIndexOf(i) != text.indexOf(i)) continue
        cont++
    }
    println(cont)
}








