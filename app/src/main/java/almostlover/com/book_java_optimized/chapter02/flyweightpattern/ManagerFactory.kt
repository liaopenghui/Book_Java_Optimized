package almostlover.com.book_java_optimized.chapter02.flyweightpattern

import android.util.Log
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class ManagerFactory :AnkoLogger{

    var finacialManagers = HashMap<String,IManager>();
    var lifeManagers = HashMap<String,IManager>();

    fun getlifeManager(ids:String):IManager{
        var lifeManager = lifeManagers.get(ids)
        if(lifeManager==null){
            lifeManager = LifeManager(ids)
            lifeManagers.put(ids,lifeManager)
            info { "需要创建新的对象$ids" }
        }else{
            info { "直接复用$ids" }
        }
        return lifeManager;
    }

    fun getFinacialManager(ids:String):IManager{
        var finacialManager = finacialManagers.get(ids)
        if(finacialManager==null){
            finacialManager = FinacialManager(ids)
            finacialManagers.put(ids,finacialManager)
            info { "需要创建新的对象$ids" }
        }else{
            info { "直接复用$ids" }
        }
        return finacialManager;
    }
}