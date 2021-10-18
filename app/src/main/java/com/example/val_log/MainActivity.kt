package com.example.val_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log
import android.content.ContentValues.TAG as TAG1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        🍀180. val, var, log
//        var: 변수를 새로 지정...o
//        val :  변수를 새로 지정...x

        var value1 = "hello"
        val value2 = "hello"

        value1 = "good"
//        value2 = "good"   -> error


        //        🍀180.-03:00. log
//      ctrl + Enter  누르면 tag...정상적으로 변경 가능함
//      ex) Log.d(tag:"MainActivity", msg: "testlog")


        Log.d("MainActivity", "testlog")


//         🍀180.-03:00.-2
        val test = "this is the test from Kei"

        Log.d("MainActivity", test)


//         🍀180.-06:30 . log.e, log.w , log.i, log.d, log.v

        Log.e("MainActivity", test)     //error
        Log.w("MainActivity", test)     //warn
        Log.i("MainActivity", test)     //info
        Log.d("MainActivity", test)     // debug
        Log.v("MainActivity", test)     //verbose (상세)






    }
}