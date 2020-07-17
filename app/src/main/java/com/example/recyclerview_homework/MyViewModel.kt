package com.example.recyclerview_homework

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
        //뷰모델로 따로 데이터관리하기위해서 이클래스 만들어주기
            //밑에 함수와 메인문과 각 어댑터 데이타 이동을 이해하기
            // 라이브 데이타는 실시간으로 데이타 보여주게 하는거
class MyViewModel: ViewModel() {
    val itemList = ArrayList<Items>()
    val Livedata = MutableLiveData<ArrayList<Items>>()

    fun mydata() {
        itemList.clear()
        for (i in 0 until 10) {
            val sampledata = Items("" + i)
            itemList.add(sampledata)
        }
        Livedata.value = itemList
    }
}