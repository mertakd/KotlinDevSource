package Kekod.Classes

/**
 *Companion object public statik final class olarak duruyor arka planda
 * Bir class ın içerisinde ki herhangi bir yapıya class ın nesnesi ni oluşturmadan erişiyorsak arka plan da statik tir.
   companion object memory de statik olarak yer kaplayan, nesne oluşturmadan üyelerine erişebilen yapı.
 *
 * comp. isim verilebilir
 * comp. miras alabilir.
 * multi inheritance yapılabilir.
 * interface içinde comp. kullanılmamalı.
 *
 * Klasın tamamını statik yapmak istemiyorsak ancak statik yapılara da ihtiyaç duyuyorsak companion object kullanılır.
   yani class ın tamamını değil de belli bir kısmını singleton yapmak isteyeceğiz.
 * */


interface HomeFragmentPresenter{
    fun navigate()
}



class HomeFragment{

    var color = "Red"


    companion object Named: HomeFragmentPresenter{

        const val TAG : String = "HomeFragment"

        private var homeFragment: HomeFragment? = null
        fun newInstance() : HomeFragment{
            homeFragment = HomeFragment()
            return homeFragment as HomeFragment
        }


        override fun navigate() {

        }
    }
}


fun main() {

    val homeFragment = HomeFragment.newInstance()
    homeFragment.color = "Blue"

    val homeFragment2 = HomeFragment.newInstance()
    homeFragment.color = "Yellow"

    val homeFragment3 = HomeFragment.newInstance()

    val homeFragment4 = HomeFragment.newInstance()
    homeFragment.color = "Cyan"

    val homeFragment5 = HomeFragment.newInstance()
    homeFragment.color = "Magenta"


    println("homeFragment color : ${homeFragment.color}")
    println("homeFragment color2 : ${homeFragment2.color}")
    println("homeFragment color3 : ${homeFragment3.color}")
    println("homeFragment color4 : ${homeFragment4.color}")
    println("homeFragment color5 : ${homeFragment5.color}")


    val homeFragment6 = HomeFragment.TAG

}