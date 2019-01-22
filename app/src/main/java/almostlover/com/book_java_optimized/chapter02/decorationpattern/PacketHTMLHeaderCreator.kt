package almostlover.com.book_java_optimized.chapter02.decorationpattern

import java.lang.StringBuilder

class PacketHTMLHeaderCreator(ipc: IPacketCreate) : PacketDecorator(ipc) {

    override fun handleContent(): String {
     var sb  : StringBuilder  =  StringBuilder()
        sb.append("<html>")
        sb.append("<body>")
        sb.append(ipcs.handleContent())
        sb.append("</body>")
        sb.append("</html>")
        return sb.toString()
    }

}