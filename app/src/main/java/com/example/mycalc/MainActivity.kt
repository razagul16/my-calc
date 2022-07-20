package com.example.mycalc

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var buttoncalc:Button ?=null
    var buttonintent:Button ?=null
    var buttonweb:Button ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncalc=findViewById(R.id.button)
        buttonintent=findViewById(R.id.button3)
        buttonweb=findViewById(R.id.button4)

        buttoncalc!!.setOnClickListener {
            val intent= Intent(this, calcActivity2::class.java)
            startActivity(intent)
        }
        buttonintent!!.setOnClickListener {
            val miguel= Intent(this, intentActivity2::class.java)
            startActivity(miguel)
        }
        buttonweb!!.setOnClickListener {
            val gitonga= Intent(this, WebActivity2::class.java)
            startActivity(gitonga)
        }


    }
}