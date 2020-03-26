package com.example.datesheet

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_success.view.*
import kotlinx.android.synthetic.main.fragmet_success.*

class Dialog:DialogFragment()
{
    private var mBool: Boolean? = false

    companion object {
        fun newInstance(bundle: Bundle): com.example.datesheet.Dialog {
            val dialog = Dialog()
            dialog.arguments = bundle
            return dialog
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val  dialog = context?.let { Dialog(it) }
       // dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
        return dialog!!


    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = layoutInflater.inflate(R.layout.activity_success,container,false)
        arguments?.getBoolean("type")?.let { setData(view,it) }
        return view
    }


    @SuppressLint("ResourceType")
    private fun setData(view: View, bool:Boolean) {
        if(bool==false){

           // img_success?.setImageResource(R.drawable.ic_report)
            view.rootView.img_success.setImageResource(R.drawable.ic_report)
            view.rootView.tv_rupee_symbol?.visibility=View.GONE
            view.rootView.tv_rupee?.text=("Payment failed")
            view.rootView.tv_name?.text=("It seems we \'have not received money")
            view.rootView.tv_update_amount?.text=("2400")



        }
    }

}


