package JetBrainsAcademy.LambdaExpressions

// let, run, with, apply,also
//Bu işlevler, nesneler için geçici bir kapsam oluşturur ve lambdalardan kod çağırır. Bir lambda içinde, it veya this anahtar kelimelerini kullanarak nesnelerle iletişim kurabiliriz




data class Musician2(var name: String, var instrument: String, var band: String)

fun main2b() {
    Musician("Dave Grohl", "Drums", "Nirvana").apply {
        println(this)
        band = "Foo Fighters"
        instrument = "Guitar"
        println(this)
    }
}




data class Musician3(var name: String, var instrument: String, var band: String)

fun main3b() {
    val dave = Musician("Dave Grohl", "Drums", "Nirvana")
    println(dave)
    dave.band = "Foo Fighters"
    dave.instrument = "Guitar"
    println(dave)
    /*
    *Apply olmadan kodumuzun ağırlaştığını ve yeni bir değişken aldığını görüyoruz.
    * daha fazla işlem eklersek kod okunamaz hale gelebilir.
    * apply kullanılmadan daha fazla işlem yapılması gereken durumlarda, kodun okunaklığının ve bakımının zorlaşabilir
    * Özetle, apply kapsam fonksiyonu, nesneyi bir kapsam içinde işlem yapmak ve ekstra değişken oluşturmadan üzerinde birden fazla işlem yapmak için kullanılabilir, bu da daha temiz ve kısa kod yazmamızı sağlar.
    *  */
}




/*
* ALSO
*The context object is available as it.
* The function returns the context object.
* APPLY 'ya benzer, ancak nesnenin tamamıyla çalışırken ve parametrelerini veya yöntemlerini umursamadığınızda da seçmeniz önerilir. */
fun main4a() {

    val instruments = mutableListOf("Guitar", "Harmonica", "Bass guitar")

    instruments
        .also { println("Right now I can play these instruments: $it") }
        .add("Theremin")
    println(instruments)
}

/*
* apply : returns context object, context object as this
* also  : returns context object, context object as it*/






//OUIZ

/*

data class TextField(
    var text: String = "Hello!",
    var textSize: Int = 12,
    var fontFamily: String = "Roboto"
)

fun main5a() {
    val textField = TextField()

    val valuesMap = mapOf<String, Int>(
        "Cancel" to 12,
        "Button" to 14,
        "Submit" to 13
    )

    textField
        .apply {
            text = readln()
            textSize = valuesMap[text]!!
        }
        .also { println("New settings: $it") }
}


*/



/*
* Apply'ı hangi durumlarda kullanabilirsiniz (Kotlin kodlama kurallarına göre)?
*Nesne ayarı için */



fun main5a() {
    //değerleri değiş tokuş etmek.
    var a = readln()
    var b = readln()

    a = b.also { b = a }

    println(a)
    println(b)
}


data class TextField(var text: String = "Hello!", var textSize: Int = 12, var fontFamily: String = "Roboto")
fun main6a() {
    TextField()
        .also { println("Old settings: $it") }
        .apply { text = readln() }
        .also { println("New settings: $it") }

}


data class Musician(var name: String, var instrument: String = "Guitar", var band: String = "Radiohead")

fun main6b() {
    val musician = Musician("Jonny Greenwood").apply {
        instrument = "Banjo" // here we can also use this.instrument
    }
    print(musician)
}




fun main7a() {
    val heroesList = mutableListOf("John Snow", "Daenerys Targaryen")
    println("Old heroes list: ${heroesList.joinToString()}")

    heroesList // Write here a chain of scope functions and MutableList methods
        .also { it.add(readLine()!!) }
        .also { println("New heroes list: ${it.joinToString()}") }
}




/*With
*İlk olarak, bağlam nesnesi ile bir şey yapmak istediğimizde ve bir sonuç almak istemediğimizde.
*  Unutmayın — with, bir lambda sonucunu döndürür, ancak Kotlin kod kurallarına göre, bu kapsam işlevini belirli bir sonuca ihtiyacımız olmadığında kullanırız.
*  Truly, "What Happens in with, stays in with". */


fun main8a() {

    val musicians = mutableListOf("Thom York", "Jonny Greenwood", "Colin Greenwood")
    with(musicians) {
        println("'with' is called with the argument $this")
        println("List contains $size elements")
    }
    // Gerekli verileri yazdırıyoruz ve kesin bir sonuç elde etmeye çalışmıyoruz
}


fun main9a() {

    val musicians = mutableListOf("Thom York", "Jonny Greenwood", "Colin Greenwood")
    val firstAndLast = with(musicians) {
                "First list element - ${first()}," +
                " last list element - ${last()}"
    }
    println(firstAndLast) // println(ilkAndLast) // Yeni bir firstAndLast değişkeni oluşturuyoruz ve fonksiyon gövdesi içindeki hesaplamaların sonucunu ona aktarıyoruz. Daha sonra bu değişkeni yazdırıyoruz.

}




/*LET
* boş olmayan nesneler
*İkinci olarak, sınırlı bir kapsamda yerel değişkenleri girmek istediğimizde let kullanırız.bu with e benzer ama let run ile kullanıldığı için farklı */

fun main9b() {
    val str: String? = "Jonny Greenwood"
//processNonNullString(str)       // compilation error: str can be null

    val length = str?.let {
        println("let() is called on $it")
        //processNonNullString(it)      // OK: 'it' is not null inside '?.let { }'
        it.length
        println("let() is called on ${it.length}")
    }
}

fun main9C() {
    run {
        val day = readln()
        val month = readln()
        val year = readln()
        "$month.$day.$year"
    }.let(::println)
}


fun main10a() {

    val musicians = listOf("Thom York", "Jonny Greenwood", "Colin Greenwood")
    val modifiedFirstItem = musicians.first().let { firstItem ->
        println("The first item of the list is '$firstItem'")
        if (firstItem.length >= 5) firstItem else "!$firstItem!"
    }.uppercase()
    println("First item after modifications: '$modifiedFirstItem'")
}



/*RUN
*ilk olarak, yeni bir nesne başlatmak ve bir lambda sonucunu ona iletmek istediğimizde.
*  */

class MultiportService(var url: String, var port: Int) {
    fun prepareRequest(): String = "Default request"
    fun query(request: String): String = "Result for query '$request'"
}

fun main10C() {
    val service = MultiportService("https://example.kotlinlang.org", 80)

    val result = service.run {
        port = 8080
        query(prepareRequest() + " to port $port")
    }
}


/*ÖZET
*with, dahili olmayan bir işlevdir ve işlev çağrılarını gruplandırmak için kullanılır.
* let usually helps us to work with the safety call operator ? or introduce an expression as a variable in a local scope.
* RUN Yeni bir nesneyi başlatmak ve bir lambda sonucunu ona iletmek için. Uzantısız bir işlev kullanmak ve birkaç operatörden oluşan bir blok yürütmek için*/

