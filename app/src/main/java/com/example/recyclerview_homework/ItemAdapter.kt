package com.example.recyclerview_homework

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val itemList:ArrayList<Items>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    // class명에 알트엔터 하면 implement속성 나옴 밑의 parent.content는 가져올 거의 모든 엑티비티 내용
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = itemList.get(position).name //id따온거 여기서 여러개로 집어넣기
    }

    class ViewHolder( itemView:View):RecyclerView.ViewHolder(itemView) {  //뷰(xml중에서) 잡아주는거임.표본에서 id따와서 다른 변수들 넣어주려고,그리고 이건 클래스 안에있는 클래
        val name = itemView.findViewById<TextView>(R.id.tv_name)
    }


}