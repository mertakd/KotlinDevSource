package JetBrainsAcademy.Projects.CoffeeMachine.JetBrainsAcademy.LambdaExpressions.InlineFunctions

/**
 * 1-Benefits of inline functions
 * Select the correct statements describing the benefits of inline functions.
 *
 * Higher-order function optimization
 * Improved performance
 * Reduction of memory usage
 *
 *
 *
 *2-When inline functions are useful
 * Look at the cases below. Select the correct cases where inline functions are useful.
 *
 * When a function is used as an argument for another function
 * When a function is used frequently
 *
 *
 *
 * 3-Filter with inline functions
 * Write a function filterByType using inline functions and reified type parameters, which takes a list of objects and an object type and then returns a new list containing only the objects of that type.
 *
 * fun main() {
 *     val mixedList: List<Any> = listOf(1, "hello", 3.14, true, 'a')
 *
 *     // Çağırım yapalım ve filtrelenmiş listeyi alalım
 *     val filteredIntList: List<Int> = filterByType<Int>(mixedList)
 *     val filteredStringList: List<String> = filterByType<String>(mixedList)
 *     val filteredBooleanList: List<Boolean> = filterByType<Boolean>(mixedList)
 *
 *     // Sonuçları yazdıralım
 *     println("Filtered Int List: $filteredIntList")
 *     println("Filtered String List: $filteredStringList")
 *     println("Filtered Boolean List: $filteredBooleanList")
 * }
 *
 *
 *
 * inline fun <reified T> filterByType(list: List<Any>): List<T> {
 *     return list.filterIsInstance<T>()
 * }
 *
 *
 *
 *
 *
 * 4-Find unique items
 * Write a function that accepts a list of objects and a selector function that selects the value of an object. The function must return a list of unique selections.
 *
 *     fun main() {
 *         val mixedList: List<Any> = listOf(1, "hello", 2, "world", 3, "hello")
 *
 *         // Bir seçici (selector) fonksiyon tanımlayalım
 *         val selector: (Any) -> Any = { it }
 *
 *         // uniqueSelectors fonksiyonunu çağırarak farklı öğeleri seçelim
 *         val uniqueSelections: List<Any> = uniqueSelectors(mixedList, selector)
 *
 *         // Sonuçları yazdıralım
 *         println("Unique Selections: $uniqueSelections")
 *     }
 *
 *
 *
 *
 *
 * fun <T, R> uniqueSelectors(list: List<T>, selector: (T) -> R): List<R> {
 *     val uniqueSet = HashSet<R>()
 *     val resultList = mutableListOf<R>()
 *
 *     for (item in list) {
 *         val selection = selector(item)
 *         if (uniqueSet.add(selection)) {
 *             resultList.add(selection)
 *         }
 *     }
 *
 *     return resultList
 * }
 *
 *
 *
 *
 * 5- Mixed up code
 *
 * inline fun <reified T> printType() {
 *
 * println(T::class.simpleName)
 *
 * }
 *
 *
 *  fun main() {
 * .
 * printType<String>()
 * printType<Int>()
 * printType<Double>()
 *
 * }
 *
 *
 *
 *
 * 6-Converting an object list
 *
 * inline fun <reified T, reified R> convertList(list: List<T>, crossinline transform: (T) -> R): List<R> {
 *     val resultList = mutableListOf<R>()
 *     for (item in list) {
 *         resultList.add(transform(item))
 *     }
 *     return resultList
 * }
 *
 *
 *
 *
 * 7- Search for a car by brand
 *
 * data class Car(val brand: String, val model: String, val year: Int, val price: Double)
 *
 * inline fun <reified T> filterByBrand(cars: List<T>, brand: String): List<T> where T : Car {
 *     return cars.filter { it.brand == brand }
 * }
 *
 *
 *
 *
 *
 * 8- What is reified type parameter
 * Look at the statements below and select the ones that best describe reified parameters.
 *
 * the parameter that can be omitted when passing parameter type
 * these are parameters that are not erased by the compiler but instead store their type information at runtime
 * */





