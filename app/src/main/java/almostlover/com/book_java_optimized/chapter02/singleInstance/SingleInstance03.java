package almostlover.com.book_java_optimized.chapter02.singleInstance;

import android.util.Log;

public class SingleInstance03 {
    private  String TAG  =getClass().getSimpleName();
    public  static String abc = "abc";
    private SingleInstance03(){
        Log.e(TAG,"初始化");
    }

    private static class SingleTonHolder{
        private static SingleInstance03 mInstance = new SingleInstance03();
    }

    public static SingleInstance03 getInstance(){
        return SingleTonHolder.mInstance;
    }
    public void sayHello(){
        Log.e(TAG,"sayHello");
    }
}
