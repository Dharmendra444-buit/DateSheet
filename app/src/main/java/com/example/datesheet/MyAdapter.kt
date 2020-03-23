package com.example.datesheet

import android.app.Activity
import android.view.Display

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.data.view.*

class MyAdapter(val arrayList: ArrayList<Model>,val context:Activity) :
RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        fun bindItems(model:Model){
            itemView.img_clock.setImageResource(model.circle)
           // itemView.img_round.setImageResource(model.circle)
            itemView.tv_math.text = model.subject
            itemView.tv_math .text=model.date
            itemView.img_clock.setImageResource(model.clock)
            itemView.tv_time.text=model.time
            itemView.tv_minutes.text=model.minutes

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.data,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        //holder.bindItems(arrayList[position])
       // holder.bindItems(arrayList[position])
        holder.bindItems(arrayList[position])

    }
}