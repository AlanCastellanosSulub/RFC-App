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
            textName.setText("")
            textApeP.setText("")
            textApeM.setText("")
            textDay.setText("")
            textMoth.setText("")
            textYear.setText("")
        }
    }


}