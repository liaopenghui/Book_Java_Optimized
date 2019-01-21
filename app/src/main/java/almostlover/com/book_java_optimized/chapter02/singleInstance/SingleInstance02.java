package almostlover.com.book_java_optimized.chapter02.singleInstance;

import android.util.Log;

public class SingleInstance02 {
    private  String TAG  =getClass().getSimpleName();
    public  static String abc = "abc";
    private SingleInstance02(){
        Log.e(TAG,"初始化");
    }

    private  static SingleInstance02 mInstance = null;

    public static synchronized SingleInstance02 getInstance(){
        if (mInstance == null) {
            mInstance = new SingleInstance02();
        }
        return mInstance;
    }
    public void sayHello(){
        Log.e(TAG,"sayHello");
    }
}
