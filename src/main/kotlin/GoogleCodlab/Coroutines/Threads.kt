package JetBrainsAcademy.Projects.CoffeeMachine.GoogleCodlab.Coroutines

fun main1() {

    //tek thread
    val thread = Thread {
        println("${Thread.currentThread()} has run.")
    }
    thread.start()
}


fun main2() {

    val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")

    repeat(3) {
        Thread {
            println("${Thread.currentThread()} has started")
            for (i in states) {
                println("${Thread.currentThread()} - $i")
                Thread.sleep(2000)
            }
        }.start()
    }
}



/*
* 3.Challenges with threads
* İş parçacığı oluşturma, değiştirme ve yönetme, sistem kaynaklarını ve zamanı tüketir ve aynı anda yönetilebilecek iş parçacıklarının ham sayısını sınırlandırır. Yaratılışın maliyetleri gerçekten artabilir.
* UI İLE İLGİLENEN THREAD E uı VEYA MAİN THREAD DENİR.
* Not: Bazı durumlarda UI iş parçacığı ve ana iş parçacığı farklı olabilir.
* çok fazla kare olması uygulamanızın yanıt vermemesine neden olur. UYGULAMA ya kareleri düşürecek ya da güncelleme döngüsünü bırakacak.*/









/*ÖNGÖRÜLEMEZ DAVARANIŞLAR
*  Bu, birden fazla iş parçacığının aynı anda bellekteki aynı değere erişmeye çalışmasıdır. Yarış koşulları, uygulamanızın genellikle tahmin edilemeyecek şekilde çökmesine neden olabilecek, yeniden üretilmesi zor, rastgele görünen hatalara neden olabilir.
* */
fun main() {
    var count = 0
    for (i in 1..50) {
        Thread {
            count += 1
            println("Thread: $i count: $count")
        }.start()
    }
}