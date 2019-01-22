package almostlover.com.book_java_optimized.chapter02.decorationpattern

class PacketBodyCreator :IPacketCreate{
    override fun handleContent(): String {
        return "核心内容"
    }

}