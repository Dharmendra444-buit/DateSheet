package com.example.datesheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_viewpager.*

class ViewPagerActivity : AppCompatActivity() {
  val dotscount:Int=5


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager)

        //
        setupIndicators()
        setCurrentIndicators(0)
        viewpager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicators(position)
            }
        })
        Log.d("item","current item="+ dotscount)
        buttonNext.setOnClickListener {
            // if (viewpager.currentItem+1<arrayList.size)
            if (viewpager.currentItem+1<5)
            {
                Log.d("hello","if"+viewpager.currentItem)
                viewpager.currentItem = viewpager.currentItem +1
            }
            else{
                Intent(applicationContext,AnotherActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }
        }
        textSkipIntro.setOnClickListener {
            val  intent= Intent(this,AnotherActivity::class .java)
            startActivity(intent)
            finish()

        }


        val arrayList = ArrayList<PagerDataModel>()
        arrayList.add(
            PagerDataModel(
                R.drawable.freedom,
                "Never lost hope in you…",
                "Success is no accident. It is hard work, perseverance, learning, studying, sacrifice and most of all, love of what you are doing or learning to do.”",
                "Share",
                "Swipe up to view previous",
                "Matagujri Public School",
                "10/03/2020 09:35 AM"
            )
        )
        arrayList.add(
            PagerDataModel(
                R.drawable.image_5,
                "PUSH YOUR SELF, BECAUSE NO ONE ELSE IS GOING TO DO IT FOUR YOU",
                "Success is no accident. It is hard work, perseverance, learning, studying, sacrifice and most of all, love of what you are doing or learning to do.”",
                "Share",
                "Swipe up to view previous",
                "DAV Public School",
                "10/03/2020 09:35 AM"
            )
        )
        arrayList.add(
            PagerDataModel(
                R.drawable.online_education,
                "Canada’s March four Expres\n" +
                        "Entry draw issues 4k invit…",
                "Canada’s March four Express Entry draw issue NASA’s Parker Solar Probe successfully executed its fourth flyby of the Sun on January 29. With this close encounter",
                "Share",
                "Swipe up to view previous",
                "Delhi Public School",
                "10/03/2020 09:35 AM"
            )
        )
        arrayList.add(
            PagerDataModel(
                R.drawable.teacher_pic,
                "A GOOD TEACHER is like a CANDLE",
                "Everyone who remembers his own educational remembers teachers, not method and techniques. the teacher is the heart of the educational system...”",
                "Share",
                "Swipe up to view previous",
                "Central Public School",
                "10/03/2020 09:35 AM"
            )
        )
        arrayList.add(
            PagerDataModel(
                R.drawable.lovekids,
                "“Love yourself. ...",
                "“There is only one happiness in this life, to love and be loved.”",
                "Share",
                "Swipe up to view previous",
                "Sacred Public School",
                "10/03/2020 09:35 AM"
            )
        )

        val viewPagerAdapter=ViewPagerAdapter(arrayList)
         viewpager.adapter=viewPagerAdapter

    }
 // code for indicator

    private fun setupIndicators(){
        val indicators= arrayOfNulls<ImageView>(dotscount)
        //   val indicators= arrayOfNulls<ImageView>(arrayList.size)
        val layoutParams: LinearLayout.LayoutParams= LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutParams.setMargins(8,0,8,0)
        for (i in indicators.indices){
            indicators[i]= ImageView(applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(applicationContext,R.drawable.indicator_inactive)
                )
                this?.layoutParams=layoutParams
            }
            indicatorContainer.addView(indicators[i])
        }
    }
    private fun setCurrentIndicators(index:Int){
        val childCount=indicatorContainer.childCount
        for (i in 0 until childCount){
            val imageView=indicatorContainer[i] as ImageView
            if (i==index){
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,R.drawable.indicator_active
                    ))
            }else
            {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,R.drawable.indicator_inactive
                    ))
            }
        }
    }


}
