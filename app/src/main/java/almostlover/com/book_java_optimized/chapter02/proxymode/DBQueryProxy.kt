package almostlover.com.book_java_optimized.chapter02.proxymode

public class DBQueryProxy :IDBQuery{
    private  var realDBQuery: RealDBQuery? = null

    override fun query(): String {
        if(realDBQuery==null){
            realDBQuery = RealDBQuery()
        }

        return realDBQuery!!.query()
    }

}