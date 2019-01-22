package almostlover.com.book_java_optimized.chapter02.observerpattern

import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.error

class Police :IPolice,AnkoLogger{
    override fun unpdate(info: String) {
        error { "收到了${info}的消息，现在采取行动" }
    }


}