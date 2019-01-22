package almostlover.com.book_java_optimized.chapter02.observerpattern

interface ITheif{
    fun attach(police:IPolice)
    fun detach(police:IPolice)
    fun info()
}