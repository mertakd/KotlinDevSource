package HeadFirstKotlin

/*

fun main() {

    // "with" ifadesi, bir nesne üzerinde belirli işlemler yapmak veya bu nesnenin özelliklerini kullanarak bir sonuç elde etmek için kullanılan bir kapsam işlevidir.
    //Sonuç döndürmeyen işlem
    val musicians = mutableListOf("Thom Yorke", "Jonny Greenwood", "Colin Greenwood")
    with(musicians) {
        println("'with' is called with the argument $this")
        println("List contains $size elements")
    }

    //Accessory (yardımcı) nesneler oluşturma
    val musicians2 = mutableListOf("Thom Yorke", "Jonny Greenwood", "Colin Greenwood")
    val firstAndLast = with(musicians2) {
                "First list element - ${first()}," +
                " last list element - ${last()}"
    }
    println(firstAndLast)


}


*/


/*
*WITH
* class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // "with" ifadesini kullanarak TextView'a ait işlemleri gerçekleştiriyoruz.
        with(textView) {
            text = "Hello, World!"
            textSize = 20f
            setTextColor(resources.getColor(android.R.color.black, null))
        }

        // "with" kullanmadan aynı işlemleri yapmak için, her seferinde textView öneki ile erişmek gerekirdi:
        // textView.text = "Hello, World!"
        // textView.textSize = 20f
        // textView.setTextColor(resources.getColor(android.R.color.black, null))
    }
}*/



//let null olup olmadığını kontrol ediyor bunu kullanmazsak compilation error veriyor
//"let" işlevi, nullable nesneler üzerinde güvenli bir şekilde işlem yapmamızı sağlar ve değişken adlandırma ile kodun okunabilirliğini artırır.
fun main35() {

    val str: String? = "Jonny Greenwood"
//processNonNullString(str)       // compilation error: str can be null

    val length = str?.let {
        println("let() is called on $it")
             // OK: 'it' is not null inside '?.let { }'
        it.length
    }



    val musicians = listOf("Thom York", "Jonny Greenwood", "Colin Greenwood")
    val modifiedFirstItem = musicians.first().let { firstItem ->
        println("The first item of the list is '$firstItem'")
        if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.uppercase()
    println("First item after modifications: '$modifiedFirstItem'")
}




//"run" işlevini "let" işlevine benzetebiliriz, ancak "let" işlevi, nullable nesnelerin güvenli çalışması için daha uygunken, "run" işlevi genellikle yeni bir nesne oluştururken ve nesneyi başlatırken kullanılır. Ayrıca, "run" işlevi, extension function olarak tanımlanır, bu nedenle mevcut bir nesne üzerinde çağrılarak kullanılır.
class MultiportService(var url: String, var port: Int) {
    fun prepareRequest(): String = "Default request"
    fun query(request: String): String = "Result for query '$request'"
}

fun main36() {
    val service = MultiportService("https://example.kotlinlang.org", 80)

    val result = service.run {
        port = 8080 // Yeni bir port değeri atanıyor.
        query(prepareRequest() + " to port $port") // Yeni bir request oluşturuluyor ve sonuç alınıyor.
    }

    println(result) // Sonuç ekrana yazdırılıyor.
}


//QUIZ
fun main37() {
    var poet: String? = readln()

    val coolScope = poet?.let { poet ->
        println("Our poet is $poet")
        poet.count { it.equals('a', ignoreCase = true) }
    } ?: 0

    println(coolScope)
}

fun main38() {
    val data = buildString {
        val day = readln() // Kullanıcıdan gün değerini alıyoruz.
        val month = readln() // Kullanıcıdan ay değerini alıyoruz.
        val year = readln() // Kullanıcıdan yıl değerini alıyoruz.

        append("$month.$day.$year") // Veriyi istenen formatta birleştirip ekrana yazdırmadan önce StringBuilder'a ekliyoruz.
    }

    // Aşağıdaki kodu değiştirmeyin
    println(data)



}

fun main39() {
    val data = run {
        val (day, month, year) = List(3) { readln() }
        "$month.$day.$year"
    }

    // Do not change the code below
    println(data)
}



data class Musician(var name: String = "", var band: String = "", var role: String = "")

fun main40() {
    val musician = Musician()

    musician.apply {
        name = readln()
        band = readln()
        role = readln()
    }.let {
        println("Name: ${it.name}")
        println("Band: ${it.band}")
        println("Role: ${it.role}")
    }
    //Bu işlemi "let" işlevi kullanarak yapabiliriz. "let" işlevi, bir nesneyi alır ve o nesneyi kullanarak bir dizi işlemi gerçekleştirmemize ve sonucu döndürmemize izin verir.
}



data class Person(var name: String = "", var age: Int = 0)

fun main41() {
    val person = Person()

    with(person) {
        this.name = "John" // "this" anahtar kelimesiyle nesne alanlarına erişim
        age = 30 // "this" kelimesini kullanmadan doğrudan nesne alanına erişim
    }

    println(person) // Output: Person(name=John, age=30)
}


fun main42() {
    val person = Person().apply {
        name = "John" // Nesne alanına doğrudan erişim
        age = 30 // Nesne alanına doğrudan erişim
    }

    println(person) // Output: Person(name=John, age=30)
}


/**
 * apply işlevi, nesne üzerindeki işlemleri hemen gerçekleştirir ve nesne kendisini döndürür. Yani yapılandırmalar ve değişiklikler hemen nesneye uygulanır.
 * also işlevi ise, lambda içindeki işlemleri hemen gerçekleştirmez, tam tersine lambda içindeki işlemleri gerçekleştirmeden önce nesneyi döndürür. Bu sayede, yapılandırmalar ve değişiklikler öncesi durumda nesneye erişim sağlanabilir.
 * Nesnelerle bazı ek şeyler yapmak için de kullanmalıyız.*/


data class Person2(var name: String = "", var age: Int = 0)

fun main43() {
    val person = Person2().apply {
        name = "John"
        age = 30
    }
    println(person) // Output: Person(name=John, age=30)
}


data class Person3(var name: String = "", var age: Int = 0)

fun main44() {
    val person = Person3().also {
        it.name = "John"
        it.age = 30
    }
    println(person) // Output: Person(name=John, age=30)
}





data class TextField(
    var text: String = "Hello!",
    var textSize: Int = 12,
    var fontFamily: String = "Roboto"
)

fun main45() {
    val textField = TextField()

    val valuesMap = mapOf<String, Int>(
        "Cancel" to 12,
        "Button" to 14,
        "Submit" to 13
    )

    val buttonName = readLine() ?: "" // Kullanıcıdan düğme adını alıyoruz

    // apply işlevini kullanarak TextField nesnesini yapılandırıyoruz
    textField.apply {
        text = buttonName // TextField nesnesinin text özelliğini alınan düğme adı ile güncelliyoruz
        textSize = valuesMap[buttonName] ?: 12 // Alınan düğme adına karşılık gelen yazı tipi boyutunu atıyoruz. Eğer düğme adı eşleşme yoksa varsayılan olarak 12 kullanıyoruz.
    }.also { println("New settings: $it") } // Yeni yapılandırılmış TextField nesnesini ekrana yazdırıyoruz.
}


fun main46() {

    val numbers = mutableListOf<Int>()
    numbers.also { println("Let's add some elements in this list") }
        .apply {
            add(2)
            add(3)
            add(1)
        }
        .also { println("And now let's sort these elements in the list") }
        .sort() // also() and sort() get as a parameter our changed context object - numbers
    println(numbers)
}



fun main47() {

    val numbers = mutableListOf<Int>(2, 6, 8, 9, 74)
    val bigNumbers = numbers.run {
        add(15) // Remember that run uses this
        add(5)
        count { it > 10 }
    } // If you put here another method or function, it will receive as a parameter the result of the last expression, the number of elements greater than ten
    println("There are $bigNumbers numbers greater than ten")

}


data class Microphone(
    var track: String = "",
    var frequency: Int = 0,
    var effect: String = "",
    var sensitivity: Double = 0.0
)

fun main48() {
    val microphone = Microphone()

    // Use apply to set the new settings received from standard input to the Microphone object
    microphone.apply {
        track = readLine() ?: ""
        frequency = readLine()?.toIntOrNull() ?: 0
        effect = readLine() ?: ""
        sensitivity = readLine()?.toDoubleOrNull() ?: 0.0
    }

    println(microphone)
}


fun main() {

    // Define variable message and give it a value from standard input
    val message = readLine() ?: ""

    // Use run to add the needed phrase after the message
    val updatedMessage = run {
        "$message\nNote! I didn't die at the end of the Drive"
    }

    // Print the updated message
    println(updatedMessage)
}


