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


//        π180. val, var, log
//        var: λ³μλ₯Ό μλ‘ μ§μ ...o
//        val :  λ³μλ₯Ό μλ‘ μ§μ ...x

        var value1 = "hello"
        val value2 = "hello"

        value1 = "good"
//        value2 = "good"   -> error


        //        π180.-03:00. log
//      ctrl + Enter  λλ₯΄λ©΄ tag...μ μμ μΌλ‘ λ³κ²½ κ°λ₯ν¨
//      ex) Log.d(tag:"MainActivity", msg: "testlog")


        Log.d("MainActivity", "testlog")


//         π180.-03:00.-2
        val test = "this is the test from Kei"

        Log.d("MainActivity", test)


//         π180.-06:30 . log.e, log.w , log.i, log.d, log.v

        Log.e("MainActivity", test)     //error
        Log.w("MainActivity", test)     //warn
        Log.i("MainActivity", test)     //info
        Log.d("MainActivity", test)     // debug
        Log.v("MainActivity", test)     //verbose (μμΈ)






    }
}