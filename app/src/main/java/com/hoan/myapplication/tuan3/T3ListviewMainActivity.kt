package com.hoan.myapplication.tuan3

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hoan.myapplication.R

class T3ListviewMainActivity : AppCompatActivity() {
    var adapter: T3Adapter? = null
    var ls = ArrayList<T3Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t3_listview_main)
        var lv=findViewById<ListView>(R.id.t3Listview) // anh xa
    //them du lieu vao listview
        ls.add(T3Contact ( "Đặng Minh Quân",  "20", R.drawable.android))
        ls.add(T3Contact ( "Fan cứng Foden",  "19", R.drawable.apple))
        ls.add(T3Contact ( "Vu Thi C",  "21", R.drawable.hp))
        ls.add(T3Contact ("Nguyen Van D",  "20", R.drawable.android))
        ls.add(T3Contact ( "Nguyen Van E",  "20", R.drawable.chrome))
        ls.add(T3Contact ( "Nguyen Van F", "20", R.drawable.apple))
        ls.add(T3Contact ( "Tran Van A",  "20", R.drawable.dell))
        ls.add(T3Contact ( "Hoang Van A",  "20", R.drawable.android))
    //tao adapter
        adapter=T3Adapter (ls,  this)
    //gan gu lieu len listview
        lv!!.adapter=adapter


    }
}