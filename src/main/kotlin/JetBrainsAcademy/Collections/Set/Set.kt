package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.Collections.Set



//İçeriğin değiştirilmesini istemediğinizde ve yalnızca benzersiz öğeleri korumak istediğinizde set seçeneğini kullanın.



fun main1() {

    val visitors = mutableListOf<String>("Vlad", "Vanya", "Liza")
    println(visitors) // output: [Vlad, Vanya, Liza]

    visitors[2] = "Nina"
    println(visitors) // output: [Vlad, Vanya, Nina]



    //İkincisi, yanlışlıkla bir hata yapabilir ve bir ziyaretçiyi iki kez kaydedebilirsiniz:
    val visitors2 = mutableListOf<String>("Vlad", "Vanya", "Liza", "Vanya")
    println(visitors2) // output: [Vlad, Vanya, Liza, Vanya]





    //Set değişmez olduğundan ve yinelenen öğelere izin vermediğinden Set bu sorunu çözmemize yardımcı olabilir:
    // Küme kopyaları desteklemediğinden, yalnızca benzersiz öğelerden oluşan bir küme elde ettik
    //Ve tabii ki Set değişmez olduğundan hiç kimse içeriğe müdahale edemeyecek.

    val visitors3 = setOf<String>("Vlad", "Vanya", "Liza", "Liza")
    println(visitors3) // output: [Vlad, Vanya, Liza]
}


fun main2() {

    //Initialization
    //Set generic bir türdür.
    val languages = setOf<String>("English", "Russian", "Italian")
    val languages2 = setOf("English", "Russian", "Italian")

    val numbers = emptySet<Int>()
    println(numbers) // output: []





    val letters = setOf<Char>('b', 'c')

    val set = buildSet<Char> {
        add('a')
        addAll(letters)
        add('d')
    }
    println(set) // output: [a, b, c, d]
}


fun main3() {
    //Methods and properties


    // isEmpty and size
    val visitors = setOf("Andrew", "Mike")

    println("How many people visited our cafe today? ${visitors.size}") // 2
    println("Was our cafe empty today? It's ${visitors.isEmpty()}") // Was our cafe empty today? It's false




    //indexOf(element) and contains
    val visitors2 = setOf("Paula", "Tanya", "Julia")

    println("Is it true that Tanya came? It's ${visitors2.contains("Tanya")}") // Is it true that Tanya came? It's true
    println("And what is her index? ${visitors2.indexOf("Tanya")}" ) // And her index is 1



    //first() and last().   kullanışlı değil
    val students = setOf("Bob", "Larry")
    println(students.first()) // Bob
    println(students.last()) // Larry





    //Bir set dizeye dönüştürmek için joinToString() işlevini kullanın, örneğin:
    val visitors3 = setOf("Paula", "Tanya", "Julia")

    val joinToString = visitors3.joinToString()

    println(joinToString) // Paula, Tanya, Julia




    //containsAll(elements)
    //Belirli bir koleksiyondaki tüm öğelerin bir Kümede bulunup bulunmadığını kontrol etmek istiyorsanız
    val studentsOfAGroup = setOf("Bob", "Larry", "Vlad")
    val studentsInClass = setOf("Vlad")

    println("Are all the students in the group in class today? It's ${studentsInClass.containsAll(studentsOfAGroup)}")
    // Are all the students in the group in class today? It's false






    //Ekledikten veya çıkardıktan sonra yeni bir set elde edeceğinizi unutmayın:
    val productsList1 = setOf("Banana", "Lime", "Strawberry")
    val productsList2 = setOf("Strawberry")

    val finalProductsList1 = productsList1 + productsList2
    println(finalProductsList1) // [Banana, Lime, Strawberry]

    val finalProductsList2 = productsList1 - productsList2
    println(finalProductsList2) // [Banana, Lime]



    // set e dönüştürmek
    val groceries = mutableListOf("Pen", "Pineapple", "Apple", "Super Pen", "Apple", "Pen")
    println(groceries.toSet()) // [Pen, Pineapple, Apple, Super Pen]

}


fun main() {

    //Iterating through elements
    val visitors = setOf("Vlad", "Liza", "Vanya", "Nina")

    for (visitor in visitors) {
        println("Hello $visitor!")
    }

}