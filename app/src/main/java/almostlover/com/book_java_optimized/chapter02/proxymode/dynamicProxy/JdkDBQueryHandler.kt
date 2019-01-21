package almostlover.com.book_java_optimized.chapter02.proxymode.dynamicProxy

import almostlover.com.book_java_optimized.chapter02.proxymode.RealDBQuery
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class JdkDBQueryHandler:InvocationHandler{
    var realDBQuery: RealDBQuery? = null

    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
        if(realDBQuery==null){
            realDBQuery = RealDBQuery()
        }
        return realDBQuery!!.query()
    }
}