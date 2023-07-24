package HeadFirstKotlin

fun main1() {

    { x: Int -> x + 5}
    fun addFive(x: Int) = x + 5

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
fun main3() {


    val result = addInts.invoke(6, 7)
    //val result = addInts(6, 7)
    println(result)
}

val addInts = { x: Int, y: Int -> x + y }
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

fun main() {

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



