package JetBrainsAcademy.JetBrainsAcademyFunction

fun main1() {

    var validationResult = false
    while (!validationResult){
        val password = readln()
        validationResult = validatePassword(password)
    }
}



fun validatePassword(password:String): Boolean{

    if (password.length < 5){
        println("Şifreniz beş veya daha uzun karakter olmalı")
        return false
    }else{
        println("iyi şifre")
        return true
    }
}


fun main() {

    val firstName = readln()
    val lastName = readln()
    val fullName = createFullname2(firstName, lastName)
    println(fullName)

}




fun createFullName(firstName:String, lastName:String): String{
    return "$firstName $lastName"
}

fun createFullname2(firstName: String,lastName: String) = "$firstName $lastName"