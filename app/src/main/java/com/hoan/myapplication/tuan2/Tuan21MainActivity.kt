package com.hoan.myapplication.tuan2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.hoan.myapplication.R

class Tuan21MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan21_main)

        val txt1 = findViewById<EditText>(R.id.tuan2Txt1)
        val txt2 = findViewById<EditText>(R.id.tuan2Txt2)
        val btn1 = findViewById<Button>(R.id.tuan2Btn1)

        btn1.setOnClickListener {
            val i = Intent(this, Tuan21MainActivityResult::class.java)
            // Sửa tên của các extra để phù hợp với mã trong Tuan21MainActivityResult
            i.putExtra("so1", txt1.text.toString())
            i.putExtra("so2", txt2.text.toString())
            startActivity(i)
        }
    }
}
