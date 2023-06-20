package HeadFirstKotlin

fun main (args: Array<String>){


    /*Argumanlar(Bağımsız Değişkenler), fonksiyonlara ilettiğiniz şeylerdir.
    * Bir parametre yerel bir değişkenden başka bir şey değildir
    *
    *
     options değişkeninin içeriği getGameChoice işlevine aktarılır.
     options değişkeni, bir Dizeler dizisine referans tutar, böylece referansın bir kopyası getGameChoice işlevine iletilir ve optionsParam parametresine girer.
     Bu, options ve optionsParam değişkenlerinin her ikisinin de aynı diziye bir referansa sahip olduğu anlamına gelir.*/



    val options = arrayOf("Rock", "Paper", "Scissors")

    val gameChoice = getGameChoice(options)

    val userChoice = getUserChoice(options)

    printResult(userChoice, gameChoice)


}





fun getGameChoice (optionParam: Array<String>) =
    optionParam[ (Math.random() * optionParam.size).toInt() ]



/*
	• options değişkeninin içeriği getGameChoice işlevine aktarılır. options değişkeni bir String array ine referans tutar, böylece referansın bir kopyası getGameChoice işlevine iletilir ve onun optionsParam parametresine girer.
	  Bu, options ve optionsParam değişkenlerinin her ikisinin de aynı diziye bir referansa sahip olduğu anlamına gelir.

	  val gameChoice = getGameChoice(options)

     * Bu, getGameChoice işlevi tarafından döndürülen referansı gameChoice adlı yeni bir değişkene yerleştirir.
      Örneğin, getGameChoice işlevi dizinin "Scissors" öğesine bir başvuru döndürürse, bu, gameChoice değişkenine "Scissors" nesnesine bir başvuru konulduğu anlamına gelir.


 */






fun getUserChoice(optionsParam: Array<String>): String {

    var isValidChoice = false
    var userChoice = ""

    //loop until the user enters a valid choice : kullanıcı geçerli bir seçenek girene kadar döngü dönecek
    while (!isValidChoice) {  //isValidChoice true olana kadar while döngüsü dönecek
        //kullanıcının seçimini iste
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")

        //Read the user input
        val userInput = readln().capitalize()

        //geçerli kullanıcı girdisi
        if (userInput != null && userInput in optionsParam){

            isValidChoice = true
            userChoice = userInput
        }

        //eğer seçim geçersizse kullanıcıya bildirin.
        if (!isValidChoice) println("You must enter a valid choice")

    }
    return userChoice


}


fun printResult(userChoice: String, gameChoice: String){

    val result: String

    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"

    println("You choce $userChoice. I chose $gameChoice. $result")
}



