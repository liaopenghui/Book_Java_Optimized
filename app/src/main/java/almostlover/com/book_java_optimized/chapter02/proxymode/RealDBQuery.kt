package almostlover.com.book_java_optimized.chapter02.proxymode

class RealDBQuery :IDBQuery{
    override fun query(): String {
        return "get content"
    }
}