package com.hoan.myapplication.tuan2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hoan.myapplication.R
import android.widget.TextView


class Tuan21MainActivityResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan21_main_result)
        var tvKQ=findViewById<TextView>(R.id.tuan2TvKQ)
        val i1=intent
        val chuoi1 = i1.extras!!.getString(  "so1")
        val so1 = chuoi1!!.toFloat()
        val chuoi2=i1.extras!!.getString( "so2")
        val so2 = chuoi2!!.toFloat()
        val tong=so1+so2
        tvKQ!!.text=tong.toString()
    }
}
