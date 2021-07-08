package com.example.rfc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var res = findViewById<TextView>(R.id.textViewR)
        var txtName = findViewById<EditText>(R.id.txtNom);
        var txtPaterno = findViewById<EditText>(R.id.txtApeP);
        var txtMaterno = findViewById<EditText>(R.id.txtApeM);
        var txtDay = findViewById<EditText>(R.id.txtD);
        var txtMoth=findViewById<EditText>(R.id.txtM);
        var txtYear=findViewById<EditText>(R.id.txtY)
        var Generate = findViewById<Button>(R.id.button);
        var Clean = findViewById<Button>(R.id.button2);



        val nom = txtName.text.toString()
        val pat = txtPaterno.text.toString()
        val mat = txtMaterno.text.toString()
        val day = txtDay.text.toString()
        val moth= txtMoth.text.toString()
        val year= txtYear.text.toString()

        val clave: MutableList<String> = mutableListOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")
        val clave2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

        Clean.setOnClickListener {
            txtNom.setText("")
            txtApeP.setText("")
            txtY.setText("")
            txtD.setText("")
            txtM.setText("")
            txtApeM.setText("")
            textViewR.text=""
        }


        Generate.setOnClickListener {
            var Nombre = nom[0].toString()
            var Paterno = pat[0].toString()
            var Paterno2 = pat[1].toString()
            var Materno = mat[0].toString()
            var Year=year[3].toString()
            var Year2=year[4].toString()
            var Moth = moth[0].toString()
            var Moth2 = moth[1].toString()
            var Day = day[0].toString()
            var Day2 = day[1].toString()
            var Homoclave = clave.random()
            var Homoclave2 = clave.random()
            var Homoclave3 = clave2.random()

            res.text = Paterno + Paterno2 +
                    Materno+ Nombre + Year +
                    Year2 + Moth + Moth2 +
                    Day + Day2 + Homoclave +
                    Homoclave2 + Homoclave3;
        }

    }
}