package almostlover.com.book_java_optimized.chapter02.singleInstance;

import almostlover.com.book_java_optimized.chapter02.proxymode.IDBQuery;
import android.util.Log;

public class SingleInstance01 {
    private  String TAG  =getClass().getSimpleName();
    public  static String abc = "abc";
    private SingleInstance01(){
        Log.e(TAG,"初始化");
    }

    private  static  SingleInstance01 mInstance =  new SingleInstance01();

    public SingleInstance01 getInstance(){

        return mInstance;
    }
}
