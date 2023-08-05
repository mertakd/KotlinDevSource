package Kekod

import java.math.BigDecimal

/*
* Let, extension function*/
fun main() {

    var bankAccount: BankAccount? = null
    bankAccount = BankAccount(
        23432.32.toBigDecimal(),
        "Mert"
    )


    if (bankAccount != null && bankAccount.accountName != null){
        println(bankAccount.accountName)
    }

}


data class BankAccount(
    val accountBalance: BigDecimal?,
    val accountName:String?,
)