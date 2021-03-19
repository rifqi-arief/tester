package com.rifqi.library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import id.qiqi.test.Math
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val math = Math()
        var hasil = math.Penjumlahan(1,1)
        Log.i("tester", hasil.toString())
    }
}