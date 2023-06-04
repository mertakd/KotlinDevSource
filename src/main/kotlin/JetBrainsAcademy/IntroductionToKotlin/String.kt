package JetBrainsAcademy.IntroductionToKotlin

fun main() {

    /**UZUNLUK*/
    val language = "Kotlin"
    println(language.length) // 6 length uzunluk demek.

    val empty = ""
    println(empty.length) // 0




    /**STRİNG BİRLEŞTİRME*/
    val str1 = "ab"
    val str2 = "cde"
    val result = str1 + str2 // "abcde"

    val one = "1"
    val two = "2"
    val twelve = one + two
    println(one)      // 1, no changes
    println(two)      // 2, no changes
    println(twelve)   // 12


    val firstName = "John"
    val lastName = "Smith"
    val fullName = firstName + " " + lastName
    println(fullName)
    //Dikkat edin, str1 + str2, str2 + str1 ile aynı değildir çünkü birleştirme, toplamanın aksine değişmeli bir işlem değildir.


    //otomatik string e çevirme: ifade string ile başlamalıdır.
    val stringPlusBoolean = "abc" + 10 + true
    println(stringPlusBoolean) // abc10true

    val code = "123" + 456 + "789"
    println(code) // 123456789

    //val errorString = 10 + "abc" // an error here!


    //string i char ile birleştirme
    val charPlusString = 'a' + "bc"
    println(charPlusString) // abc
    val stringPlusChar = "de" + 'f'
    println(stringPlusChar) // def

    //cahr string ve tam sayı birleştirme.
    val charPlusStringPlusInt = 'a' + "bc" + 123
    println(charPlusStringPlusInt) // abc123


    /**STRİNG TEKRARLAMA*/
    //Bir dizeyi iki veya daha fazla kez tekrarlamanız gerekiyorsa, döngülerinizi tutun: Kotlin, REPEAT tekrarlama işlevini sağlar:
    print("Hello".repeat(4)) // HelloHelloHelloHello

    println("Eat. Sleep. Code.\n".repeat(7)) // \n gives you a line feed (new line)



    println("Kacis Dizeleri")
    /** KAÇIŞ DİZELERİ (Raw string or Escape sequences)*/
    // prints 'H' is the first letter of "Hello world!" string.
    println(" \'H\' is the first letter of \"Hello world!\" string. ")


    val largeString = """
    This is the house that Jack built.
      
    This is the malt that lay in the house that Jack built.
       
    This is the rat that ate the malt
    That lay in the house that Jack built.
       
    This is the cat
    That killed the rat that ate the malt
    That lay in the house that Jack built.
    """.trimIndent() // ilk ve son satırları kaldırır ve girintileri kırpar
    print(largeString)


        val unevenString = """
            123
             456
              789""".trimIndent()
        print(unevenString)
        println()

        val rawString = """123
             456
              789
    """.trimIndent()
        print(rawString )
}