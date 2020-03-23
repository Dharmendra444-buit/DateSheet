package com.example.datesheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var btn:Boolean =true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrayList=ArrayList<Model>()
        arrayList.add(Model(R.drawable.ic_circle,"Maths","26 May2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))
        arrayList.add(Model(R.drawable.ic_circle,"English","27 May2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))
        arrayList.add(Model(R.drawable.ic_circle,"Geography","30 May2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))
        arrayList.add(Model(R.drawable.ic_circle,"History","05 Jun 2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))
        arrayList.add(Model(R.drawable.ic_circle,"Science","07 Jun 2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))
        arrayList.add(Model(R.drawable.ic_circle,"Hindi","10 Jun 2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))
        arrayList.add(Model(R.drawable.ic_circle,"Maths","26 May2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))


     // val myAdapter=MyAdapter(this,arrayList)
    //  val myAdapter=MyAdapter(arrayList,this)
    // //recyclerview123?.adapter=myAdapter
        val myAdapter=MyAdapter(arrayList,this)
        recyclerview123?.adapter=myAdapter



       // btn_icon.setOnClickListener {

        //}
        btn_icon.setOnClickListener {
            if (btn){
                recyclerview123.visibility=View.GONE
                btn=false
            }

            else
            {
                recyclerview123.visibility=View.VISIBLE
                btn=true
            }
        }
    }
}
