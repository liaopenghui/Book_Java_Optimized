package almostlover.com.book_java_optimized.chapter02.observerpattern

class Theif :ITheif{

    var polices =  ArrayList<IPolice>()
    override fun attach(police: IPolice) {
        polices.add(police)
    }

    override fun detach(police: IPolice) {
        polices.remove(police)

    }
    override fun info() {
        for (police in polices){
            police.unpdate("不好了，小偷偷东西了")
        }
    }

}