package com.example.recyclerview_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList = arrayListOf(
            Items("김태혁"),
            Items("김준영"),
            Items("김현도"),
            Items("이범희"),
            Items("배홍식"),
            Items("황한식")
       )

        rv_title.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv_title.setHasFixedSize(true)

        rv_title.adapter = ItemAdapter(itemList)
    }
}