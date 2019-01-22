package almostlover.com.book_java_optimized.chapter02.decorationpattern

import java.lang.StringBuilder

class PacketHTTPHTMLHeaderCreator(ipc: IPacketCreate) : PacketDecorator(ipc) {


    override fun handleContent(): String {
     var sb  : StringBuilder  =  StringBuilder()
        sb.append("cache-control--11111")
        sb.append(ipcs.handleContent())
        sb.append("cache-control--end")

        return sb.toString()

    }

}