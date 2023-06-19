package JetBrainsAcademy.Andromeda
/*

fun main1() {

    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach { number -> //lambda fonksiyonu
        println(number)
    }
}


fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEachIndexed { index, number ->
        if (index == 2) {
            return@forEachIndexed
        }
        println(number)
    }
}

*/




//FOREACH DE BREAK VE CONTINUE KULLANIMI LABEL İLE

//CONTINUE
fun main1() {

    val list = listOf(3, 4, 3, 4, 3)
    var sum = 0
    list.forEach loop@{ number ->
        if (number % 2 == 0) { // tüm çift sayıları atla
            return@loop
        }
        sum += number
    }




    run outer@{
        list.forEach inner@{ number ->
            if (number % 2 == 0) { // 'break' ilk çift sayıda break
                return@outer
            }
            sum += number
        }
    }

    val result = sum == 9
    if (result){
        println("esittir 9 a")
    }






}









