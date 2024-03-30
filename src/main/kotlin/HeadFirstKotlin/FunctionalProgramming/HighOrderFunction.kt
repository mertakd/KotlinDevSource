package JetBrainsAcademy.Projects.CoffeeMachine.HeadFirstKotlin.FunctionalProgramming

fun main1111() {

    val fahrenheit = convert(29.0, { c:Double -> c * 1.8 + 32})


    val fahrenheit2 = {c:Double ->
        c * 1.8 + 32
    }
    convert(29.0,fahrenheit2)



    val fahrenheit3 = fun (c:Double):Double{
        return  c * 1.8 + 32
    }

    convert(29.0, fahrenheit3)




    convert(29.0,::fahrenheit4)


}

fun fahrenheit4(c:Double):Double = c * 1.8 + 32




fun convert(x:Double, converter: (Double) -> Double) : Double {

    val result = converter(x)
    println("$x is converter to $result")
    return result
}




/*fun main4445() {

    val pounds = getConversionLambda("KgsToPounds") (2.5)
    println(pounds)

}*/
/*fun getConversionLambda(str: String): (Double) -> Double {

    if (str == "CentigradeToFahrenheit"){
        return {it * 1.8 + 32 }
    }else if (str == "KgsToPounds"){
        return {it * 30.055555}
    }else if (str == "PoundsToUSTons"){
        return {it / 2000.0}
    }else{
        return {it}
    }
}*/






fun getConversionLambda(str: String): (Double) -> Double {
    return when (str) {
        "CentigradeToFahrenheit" -> { value -> value * 1.8 + 32 }
        "KgsToPounds" -> { value -> value * 30.055555 }
        "PoundsToUSTons" -> { value -> value / 2000.0 }
        else -> { value -> value }
    }
}


fun combine(lambda1: (Double) -> Double, lambda2: (Double) -> Double) : (Double) -> Double{

    return { x:Double -> lambda2(lambda1(x))}
}


fun main() {
    val kgsToPounds = { x: Double -> x * 2.204623 }
    val poundsToUSTons = { x: Double -> x / 2000.0 }
    val kgsToUSTons = combine(kgsToPounds, poundsToUSTons)


    val kilograms = 100.0
    val usTons = kgsToUSTons(kilograms)

    println("$kilograms Kilogram, US Ton'a dönüştürüldü: $usTons")

}
