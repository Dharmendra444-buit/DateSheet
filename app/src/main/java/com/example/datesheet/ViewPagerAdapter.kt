package com.example.datesheet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_view_pager.view.*

class ViewPagerAdapter(val arrayList: ArrayList<PagerDataModel>):
        RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>(){

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        fun bind(model:PagerDataModel){
            itemView.iv_img.setImageResource(model.img)
            itemView.tv_title.text=model.title
            itemView.tv_description.text=model.description
            itemView.tv_share.text=model.share
            itemView.tv_swipe_up.text=model.swipe
            itemView.tv_school.text=model.school
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(parent.context).inflate
           (R.layout.row_view_pager,
           parent,
           false))
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(arrayList[position])
    }
}