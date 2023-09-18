package HeadFirstKotlin

fun main1() {

    fun addFive(x: Int) = x + 5
    {x: Int -> x + 5}

    //Ancak lambdaların isimleri yoktur, dolayısıyla anonimdirler.
    { x:Int, y:Int -> x + y}
}

/*
*Lambdalara neden lambda denir? C: Bunun nedeni, küçük, anonim fonksiyonların Yunanca λ harfi (bir lambda) ile temsil edildiği Lambda Calculus adı verilen bir matematik ve bilgisayar bilimi alanından gelmeleridir.
*lambda görevi : lambda ona bu durumda özellikle neye göre sıralanacağını söyler
* x:Int parametre
*  -> parametre tanımının ardından herhangi bir parametreyi vücuttan ayırmak için kullanılır. Bu, "Hey parametreler, şunu yapın!" demek gibidir.
* x + 5 lambda gövdesi, Bu, lambda çalıştığında yürütülmesini istediğiniz koddur. Gövde birden çok satıra sahip olabilir ve gövdede son değerlendirilen ifade, lambda'nın dönüş değeri olarak kullanılır.
* lambdaların adı yoktur, yani anonimdirler.
* Lambda'nın parametresi yoksa, -> öğesini atlayabilirsiniz. {"Pow"}*/







//ASSIGN  A VARIABLE
fun main2() {

    val addFive = { x: Int -> x + 5 }

    var add = { x:Int -> x + 5}
    add = { y:Int -> y + 5}


}
/*
* Bir değişkene bir lambda atadığınızda, ona çalıştırılan kodun sonucu değil, bir kod bloğu atarsınız. Kodu bir lambda içinde çalıştırmak için, onu açıkça çağırmanız gerekir.
* */





//INVOKING
fun main() {


    val result = addInts.invoke(6, 7)
    //val result = addInts(6, 7)
    println(result)
}

val addInts = { x: Int, y: Int -> x + y }
// bu lambda da hesaplama işlemi gerçekleşiyor
/*
* Bu, { x: Int, y: Int -> x y } değerinde bir lambda oluşturur. addInts adlı yeni bir değişkene lambdaya bir referance atanır.
*Bu, eklentiler tarafından başvurulan lambdayı çağırır ve 6 ve 7 değerlerini iletir. 6, lambdanın x parametresine ve 7, lambdanın y parametresine gelir.
*Lambda gövdesi x y'yi çalıştırır ve hesaplar. Lambda, 13 değerine sahip bir Int nesnesi oluşturur ve ona bir referance döndürür.
* Lambda tarafından döndürülen değer, sonuç adlı yeni bir Int değişkenine atanır.  */





//LAMBDA EXPRESSION
fun main4() {

    //val msg = { x: Int -> "The value is $x" }   //türünü kendisi çıkarım yapabilir
    //(Int) -> String



    //türü kendimiz de belirtebiliriz
    val add: (Int, Int) -> Int //2 parametre tipi ve lambda dönüş tipi
    add = { x: Int, y: Int -> x + y }

    val add2: (Int, Int) -> Int = { x: Int, y: Int -> x + y }




    //parametresiz
    //val greeting: () -> String = { "Hello!" }
    //val greeting: () -> String




    //lambda da türü yazmasan bile compiler bunu anlar
    val addFive: (Int) -> Int = {x -> x + 5}  //x in tipini belirtmedik.



    //Tek parametre de it kullanılabilir
    val addFive2: (Int) -> Int = { x: Int -> x + 5 }
    val addFive3: (Int) -> Int = { it + 5 }
    //val addFiveBad: {it + 5}   compiler olmaz parametre ve dönüş tipi yazmıyor




    //Bir lambda'nın dönüş değeri olmadığını belirtmek istiyorsanız, dönüş türünün Unit olduğunu bildirerek bunu yapabilirsiniz
    val myLambda: () -> Unit = { println("Hi!") }


    //Bir lambda hesaplamasının sonucuna erişmek istemediğinizi açıkça belirtmek için Unit'i de kullanabilirsiniz. Örneğin, aşağıdaki kod derlenecek, ancak x y'nin sonucuna erişemeyeceksiniz:
    val calculation: (Int, Int) -> Unit = { x, y -> x + y }





}

fun mainQuiz() {

    val lam1 = {x: Int -> x}
    println(lam1(29 + 6))

    val lam2: (Double) -> Double
    lam2 = {(it * 2) + 5}
    println(lam2)

    val lam3: (Double, Double) -> Unit
    lam3 = { x,y -> println(x + y) }
    println(lam3)


    var lam4 = {y:Int -> (y/2).toDouble()}
    print(lam4(29))
    lam4 = {it + 6.3}
    println(lam4(7))
}




//HIGH-ORDER
fun main5() {


    val fahrenheit = convert(20.0, {c:Double -> c * 1.8 + 32} )
    //val fahrenheit1 = convert(20.0) { c: Double -> c * 1.8 + 32 } bu şekil de çağırılabiliyor

    val fahrenheit2 = convert(20.0, {it * 1.8 + 32} ) //it ile kısaltabilitoruz

    val fahrenheit3 = convert(20.0) { it * 1.8 + 32 }

}

fun convert(x:Double, converter: (Double) -> Double) : Double{

    val result = converter(x)
    println("$x is converted to $result")
    return result


}
/*
* 20.0 Santigrat dereceyi Fahrenheit'e dönüştürmek için dönüştürme
* Parametre veya dönüş değeri olarak bir lambda kullanan bir işlev, üst düzey işlev olarak bilinir.
* Dönüşüm uygulaması-: Bir Double'ı diğerine dönüştürmesi için convert işlevine iki şey söylememiz gerekir: dönüştürmek istediğimiz Double ve nasıl dönüştürüleceğini belirten lambda. Bu nedenle convert işlevi için iki parametre kullanacağız: Double ve lambda.*/








//tek parametreli fonksiyonda, lambda nın it ile kullanımı
fun main6() {

    convertFive { c:Int -> c * 1.8 + 32 }

    convertFive { it * 1.8 + 32 } //tek parametreli de parantez kullanmamıza gerek yok

    convertFive { c:Int -> println(c)  //lambda, parametresinin değerini yazdırır ve ardından bunu bir hesaplamada kullanır
        c * 1.8 + 32 }
}

fun convertFive(converter: (Int) -> Double) : Double{

    val result = converter(5)

    println("5 is converted to $result")

    return result

}





//geri dönüş değeri olarak lambda

fun main7() {

    val pounds = getConversionLambda("KgsToPounds") (5.0)
    println(pounds)
}
fun getConversionLambda(str: String): (Double) -> Double {

    if (str == "CentigradeToFahrenheit"){
        return {it * 1.8 + 32 }
    }else if (str == "KgsToPounds"){
        return {it * 30.055555}
    }else if (str == "PoundsToUSTons"){
        return {it / 2000.0}
    }else{
        return {it}
    }
}


//noraml fonksiyonla dönüştürme
fun main8() {

    val number = 5

    val squaredNumber = square(number)
    val cubedNumber = cube(number)

    println("Squared Number: $squaredNumber")
    println("Cubed Number: $cubedNumber")
}


fun square(x:Int):Int{
    return x * x
}

fun cube(x:Int):Int{
    return x * x * x
}




//High-order Fonksiyon ve Lambda İfadesi Kullanarak Dönüşüm:
//High-order fonksiyon ve lambda ifadesi kullanıldığında ise convert fonksiyonu sayesinde farklı dönüştürme işlemleri için ayrı ayrı fonksiyon tanımlamamıza gerek yoktur. Dönüşümü lambda ifadesi olarak belirleyerek farklı dönüşüm işlemlerini tek bir fonksiyonla gerçekleştirebiliriz.

fun main9() {

    val number = 5

    val square = { x:Int -> x * x}
    val cube = {x:Int -> x * x * x}

    val squaredNumber = convert2(number, square)
    val cubedNumber = convert2(number,cube)


    println("Squared number: $squaredNumber")
    println("Cubed number: $cubedNumber")
}
fun convert2(x:Int, converter: (Int) -> Int): Int{
    return converter(x)
}













//Lambda İfadeleri Kullanmadan
fun convert4(conversionType:String, amount:Double): Double{
    return when(conversionType){
        "DollarToTL" -> amount * 26.96
        "EuroToTL" -> amount * 29.87
        "PoundToTL" -> amount * 34.82
        else -> amount
    }
}


fun main10() {

    val amount = 100.0

    val tlFromDollar = convert4("DollarToTL", amount)
    println("$amount dolar, $tlFromDollar Türk Lirası Ediyor")

    val tlFromEuro = convert4("EuroToTL", amount)
    println("$amount euro, $tlFromEuro Türk Lirası Ediyor")

    val tlFromPound = convert4("PoundToTL", amount)
    println("$amount pound, $tlFromPound Türk Lirası Ediyor")
}



//High-Order Fonksiyon ve Lambda İfadeleri Kullanarak


fun main87() {
    val amount = 100.0

    val tlFromDollar = convertTo(amount) {it * 26.96}
    println("$amount dolar, $tlFromDollar Türk Lirası Eder")

    val tlFromEuro = convert(amount) {it * 29.87}
    println("$amount euro, $tlFromEuro Türk Lirası Eder")

    val tlFromPound = convert(amount) {it * 34.82}
    println("$amount pound, $tlFromPound Türk Lirası Eder")
}

fun convertTo(amount:Double, converter: (Double) -> Double):Double{
    return  converter(amount)
}






