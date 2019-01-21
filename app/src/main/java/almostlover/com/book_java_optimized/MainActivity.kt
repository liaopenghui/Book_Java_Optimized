package almostlover.com.book_java_optimized

import almostlover.com.book_java_optimized.chapter02.flyweightpattern.ManagerFactory
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
//        callDynamicProxy()

        flyweightpattern();
    }

    private fun flyweightpattern() {
       var manager = ManagerFactory()
        val finacialManager = manager.getFinacialManager("111");
        val finacialManager1 = manager.getFinacialManager("111");
        val finacialManager12 = manager.getFinacialManager("222");
        finacialManager.getResult()
        finacialManager1.getResult()
        finacialManager12.getResult()

        val lifeManager = manager.getlifeManager("111");
        val lifeManager1 = manager.getFinacialManager("111");
        val lifeManager12 = manager.getFinacialManager("222");
        lifeManager.getResult()
        lifeManager1.getResult()
        lifeManager12.getResult()



    }

    private fun callDynamicProxy() {
        val classes = arrayOf<Class<*>>(IDBQuery::class.java)
        val newProxyInstance =Proxy.newProxyInstance(IDBQuery::class.java.classLoader, classes, JdkDBQueryHandler()) as IDBQuery
       toast(newProxyInstance.query())
    }
}
