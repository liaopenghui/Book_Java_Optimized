package almostlover.com.book_java_optimized.chapter02.flyweightpattern

class FinacialManager(id:String) : IManager{
    var ids:String
init {
    ids = id
}

    override fun getResult(): String {
            return "第${ids}的余额是${ids}"
    }

}