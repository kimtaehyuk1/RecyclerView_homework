package com.example.recyclerview_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val viewModel : MyViewModel by viewModels() //뷰모델 임플리먼테이션과 옵션 바꿔주기

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.mydata()
        rv_title.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv_title.setHasFixedSize(true)

        rv_title.adapter = ItemAdapter(viewModel.itemList)
        viewModel.Livedata.observe(this, Observer {  })
    }
}