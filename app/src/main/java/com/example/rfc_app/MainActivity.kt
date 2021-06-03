package com.example.rfc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onClick(v: View?) {
        button2.setOnClickListener {
            editText1.setText("")
            editText2.setText("")
            editText3.setText("")
            editText4.setText("")
            editText5.setText("")
            editText6.setText("")
            editText7.setText("")
        }
    }

    fun onClick2(v: View?) {
        button2.setOnClickListener {

        }
    }


}