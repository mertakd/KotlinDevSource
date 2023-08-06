package Turkcell.Lists

/**
 * Array de arrayindexoutofboundsexception hatası:length4 index 4;
 * buna eleman ekleyemiyoruz.Dizinin eleman sayısını arttıramıyoruz.Kopyalama vs gibi işlemlerle arttırmanın yolları var.Böyle de yaparsak elimizde ki mevcut dizi değil de arka plan da bir dizi daha oluşturarak işlem yapabiliyoruz.
 * Başlangıçda kaç tane eleman vermişssek buna göre bir boyut oluşturulur ve daha sonra değiştirilememz.*/


fun main1() {

    //eleman eklenmez array olduğu için.size eklenimyor yani:4 size var 5. eklenmeye çalışıyor
    val dizi = intArrayOf(1,5,7,9)

    val d1 =dizi[0]

    //aşağısı hatalı
    //dizi[4] = 45
    //println(dizi[4])



    //eleman ekleyebiliriz arraylistof ile
    //türünü any yapabiliriz ama mesela string ile ilgili bir işlem yapacaksak dönüştürme yapmamaız lazım.
    var arrayList = arrayListOf<String>()
    arrayList.add("eleman1")
    arrayList.add("eleman2")
    println(arrayList.get(1))

    arrayList.add(1,"Yeni eleman 1")
    arrayList.add(0,"Yeni eleman 2")
    println(arrayList)
    println(arrayList.get(1))

    var filtreliListe = arrayList.filter { it.length > 8 }

    println(filtreliListe.size)
    //liste de uzunluğu 8 den fazla olan 2 eleman var.
}


fun main2() {

    var meyveler = arrayListOf<String>()
    meyveler.add("elma")
    meyveler.add("armut")
    meyveler.add("portakal")



    for (index in 0 until meyveler.size){

        println("${index} until yapısının indexindeki meyvenin adı: ${meyveler[index]}")
    }




    var istenen = "armut"

    for (index in 0..meyveler.size-1){

        println("${index} indexindeki meyvenin adı: ${meyveler[index]}")

        if (meyveler[index] == istenen){
            println(index)
        }
    }



    for (meyve in meyveler){
        //index ile işimiz yoksa bu şekil kullan.
        print("meyvenin indexi $meyve")

        if (meyve == istenen){
            println(meyveler.indexOf(meyve))
            //index ini aldık
        }
    }

    println(meyveler.indexOf(istenen))
}


fun main3() {
    //SET: içinden sadece anynı elemandan bir tane olmasını istersek kullanıyoruz.
    //tekrarlı olan elamanlar eklenmiyor.


    var st = setOf<Int>(1,2,3,4,2,1,3)
    println(st.size) //4


    st.forEach {
        println(it)
        //1,2,3,4
    }



    println("set konusu")
    //set lerde array ler gibi daha sonra boyutları değiştirilemez.
    // array list lerde ki gibi ekleme yapmak istiyorsak HashSet yapısı oluşturmalıyız.
    var hasSt = HashSet<Int>()
    hasSt.add(1)
    hasSt.add(2)
    hasSt.add(1)

    println(hasSt.size) //2
    hasSt.forEach {
        println(it)
        //1,2
    }


}


fun main4() {
    //MAP: key-value yapısı.


    //bu array ile uzun yolu
    var meyveler = arrayOf("Elma", "Armut")
    var kaloriler = arrayOf(100,120)
    println("${meyveler[0]} : ${kaloriler[0]}")



    println("hash map ile")
    var hMap = hashMapOf<String,Int>()
    hMap.put("Elma",100)
    hMap.put("Armut",120)

    println(hMap["Elma"]) //100
    hMap["Elma"] = 200
    println(hMap["Elma"])

    hMap.put("Elma", 300)
    println(hMap["Elma"])


    println("başlangış elemanı atama")
    //başlangıç elemanı atama
    var hMap2 = hashMapOf<String,Int>("Elma" to 100, "Armut" to 120)
    hMap2.forEach{
        println(it)
        println("${it.key} : ${it.value}")
    }


    println("hash fitre")
    var filtreliHas = hMap2.filter {
        it.value < 110
    }
    filtreliHas.forEach{
        println(it)
    }
}


fun main() {
    //Collection Lab


    var notlar = arrayListOf<ArrayList<Float>>()
    var ortalamalar = arrayListOf<Float>()
    var durumlar = arrayListOf<String>()


    notlar.add(arrayListOf(50f, 40f, 40f))
    notlar.add(arrayListOf(100f, 60f, 90f))

    for (i in 0..notlar.size-1){

        var ortalama = notlar[i].reduce { baslangıc, gecerli -> baslangıc + gecerli  } / notlar[i].size
        ortalamalar.add(ortalama)
    }

    durumlar = ortalamalar.map {

        if (it < 50){
            "Kaldı"
        }else{
            "Geçti"
        }
    } as ArrayList<String>

    ortalamalar.forEach {
        println(it)
    }

    durumlar.forEach {
        println(it)
    }

}