package JetBrainsAcademy.Projects.CoffeeMachine.Atom.FunctionalProgramming.Lambdas

fun main1a() {
    val list = listOf(1, 2, 3, 4)
    val result = list.map { n: Int -> "[$n]" }
    println(result)
}

//tür çıkarımı
fun main1b() {
    val list = listOf(1, 2, 3, 4)
    val result = list.map { n -> "[$n]" }

}



//tek parametre varsa it kullanılabilir.
fun main1c() {
    val list = listOf(1, 2, 3, 4)
    val result = list.map { "[$it]" }

}



// it ve char ile kullanımı
fun main1d() {
    val list = listOf('a', 'b', 'c', 'd')
    val result =
        list.map { "[${it.uppercaseChar()}]" }
    println(result)
}




fun main1e() {
    val list = listOf(9, 11, 23, 32)
    list.joinToString(" ") { "[$it]" }

}



fun main1f() {
    val list = listOf(9, 11, 23, 32)
    list.joinToString(
        separator = " ",
        transform = { "[$it]" }
    )
    println(list)
}



fun main1g() {
    val list = listOf('a', 'b', 'c')
    list.mapIndexed { index, element ->
        "[$index: $element]"
    }
    println(list)
    //listOf("[0: a]", "[1: b]", "[2: c]")
}



fun main() {
    val list = listOf('a', 'b', 'c')
    list.mapIndexed { index, _ ->
        "[$index]"
    }
    println(list)
    //listOf("[0]", "[1]", "[2]")
}

