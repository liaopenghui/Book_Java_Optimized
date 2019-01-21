package almostlover.com.book_java_optimized

import almostlover.com.book_java_optimized.chapter02.proxymode.DBQueryProxy
import almostlover.com.book_java_optimized.chapter02.proxymode.IDBQuery
import almostlover.com.book_java_optimized.chapter02.proxymode.dynamicProxy.JdkDBQueryHandler
import almostlover.com.book_java_optimized.chapter02.singleInstance.SingleInstance03
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.toast
import java.lang.reflect.Proxy

class MainActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        callDynamicProxy()
    }

    private fun callDynamicProxy() {
        val classes = arrayOf<Class<*>>(IDBQuery::class.java)
        val newProxyInstance =Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), classes, JdkDBQueryHandler()) as IDBQuery
       toast(newProxyInstance.query())
    }
}
