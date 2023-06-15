package JetBrainsAcademy.Andromeda

fun main() {
    val message = "ANDROMEDA"
    val key = "312045876"

    val encryptedMessage = encryptMessage(message, key)
    println("Şifreli Mesaj: $encryptedMessage")
}

fun encryptMessage(message: String, key: String): String {

    val encryptedChars = CharArray(message.length)

    for (i in message.indices) {
        val locationIndex = key[i].toString().toInt()
        //key dizisindeki her bir karakter, mesajdaki karakterin şifrelenmiş konumunu temsil eder. ilk index 3 mesela
        encryptedChars[locationIndex] = message[i]
        //message = "ANDROMEDA" 0.index i al, key de ki konumuna göre atama yap.
    }

    return encryptedChars.joinToString("")
}
