package com.example.datesheet

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var btn:Boolean =true
  //  val fragclass=SuccessFragment
     // lateinit var dialog: Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // method call openDialog(isSuccessClicked=true)
        openDialog()
        //openDialog(isSuccessClicked = true)
        val arrayList=ArrayList<Model>()

        arrayList.add(Model(R.drawable.ic_circle,"Maths","26 May2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))
        arrayList.add(Model(R.drawable.ic_circle,"English","27 May2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))
        arrayList.add(Model(R.drawable.ic_circle,"Geography","30 May2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))
        arrayList.add(Model(R.drawable.ic_circle,"History","05 Jun 2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))
        arrayList.add(Model(R.drawable.ic_circle,"Science","07 Jun 2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))
        arrayList.add(Model(R.drawable.ic_circle,"Hindi","10 Jun 2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))
        arrayList.add(Model(R.drawable.ic_circle,"Maths","26 May2019",R.drawable.ic_clock,"9:30 AM - 10:30 AM","60 Minutes"))


        val myAdapter=MyAdapter(arrayList,this)
        recyclerview123?.adapter=myAdapter


       // openDialog(isSuccessClicked = true)
        btn_sucess.setOnClickListener {


            // bellow code for custom dialog means Dialog class
            Dialog.newInstance(bundleOf("type" to true)).show(supportFragmentManager,"TAG")


            // comment code is not use in project it is used for fragment
           /* val fr=SuccessFragment.newInstance(bundleOf("isSuccess" to true))
           //val transaction=supportFragmentManager.beginTransaction()
            transaction.add(R.id.frameLayout,fr,null)
           transaction.addToBackStack(null)
            transaction.commit() */

            // bellow line code is for activity
          /*
            val intent=Intent(this,SuccessActivity::class.java)
            intent.putExtra("isSuccess",true)
            startActivity(intent)  */
        }

        btn_failure.setOnClickListener {

            // bellow code for custom dialog class
           // openDialog(isSuccessClicked = false)
            Dialog.newInstance(bundleOf("type" to false )).show(supportFragmentManager,"TAG")

            // comment code is not use in project it is used for fragment SuccessFragment.xml and SuccessFragment.kt also not used

          /*  val fr=SuccessFragment.newInstance(bundleOf("isSuccess" to false))
            val transaction=supportFragmentManager.beginTransaction()
            transaction.add(R.id.frameLayout,fr,null)
            transaction.addToBackStack(null)
            transaction.commit() */


          /*  val intent=Intent(this,SuccessActivity::class.java)
            intent.putExtra("isSuccess",false)
            startActivity(intent)  */
        }
        btn_open_viewPager.setOnClickListener {
            val intent=Intent(this,ViewPagerActivity::class.java)
            startActivity(intent)
        }
    }
   fun openDialog(){
   // fun openDialog(isSuccessClicked:Boolean){
        var exampleDialog=Dialog()
        exampleDialog.show(supportFragmentManager,"example dialog")

    }

}
