package almostlover.com.book_java_optimized.chapter02.decorationpattern

 abstract class PacketDecorator(
    ipc: IPacketCreate
) : IPacketCreate {
    var ipcs: IPacketCreate = ipc

}