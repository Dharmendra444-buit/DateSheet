package com.example.datesheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragmet_success.*

class SuccessActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

          val intent=intent
        val boolean=intent.getBooleanExtra("isSuccess",false)

        if (!boolean){
            img_success.setImageResource(R.drawable.ic_report)
            tv_rupee_symbol?.visibility=View.GONE
            tv_rupee?.text = ("Payment failed")
            tv_name?.text = ("It seems we have not received money")
           // tv_update_balance?.text = ("2400")
            tv_update_amount?.text=("2400")
        }


    }

}

