package com.rogerb.additioncalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sum()
    }
    private fun sum(){
        val fn=findViewById<EditText>(R.id.FirstNumber)
        val sn=findViewById<EditText>(R.id.SecondNumber)
        val rs=findViewById<TextView>(R.id.Result)
        val btn=findViewById<Button>(R.id.addbtn)

        btn.setOnClickListener {
            rs.text = (fn.text.toString().toDouble() + sn.text.toString().toDouble()).toString()


        }


    }

    }
