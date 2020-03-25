package com.example.datesheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragmet_success.*
import java.util.zip.Inflater

class SuccessFragment:Fragment() {

    companion object {
        fun newInstance(bundle: Bundle):SuccessFragment {
            val fragment = SuccessFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v=inflater.inflate(R.layout.fragmet_success,container,false)
        setUp(v)
        return v
    }

    private fun setUp(view: View) {
        val isSuccess  = arguments?.getBoolean("isSuccess")?:false
       if (!isSuccess) {

            img_success?.setImageResource(R.drawable.ic_report)
            tv_rupee_symbol?.visibility=View.GONE
            tv_rupee?.text = ("Payment failed")
            tv_name?.text = ("It seems we have not received money")
            tv_update_balance?.text = ("2400")
        }
    }
}


