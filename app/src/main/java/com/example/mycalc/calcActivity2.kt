package com.example.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calcActivity2 : AppCompatActivity() {
    lateinit var button2add:Button
    lateinit var button5sub:Button
    lateinit var button11mult:Button
    lateinit var button12div:Button
    lateinit var numbernum1:EditText
    lateinit var numbernum2:EditText
    lateinit var Txt_Answer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc2)
        button2add=findViewById(R.id.button2)
        button5sub=findViewById(R.id.button5)
        button11mult=findViewById(R.id.button11)
        button12div=findViewById(R.id.button12)
        numbernum1=findViewById(R.id.num1)
        numbernum2=findViewById(R.id.num2)
        Txt_Answer=findViewById(R.id.textView)


        button2add.setOnClickListener {
            var firstnumber=numbernum1.text.toString()
            var secondnumber=numbernum2.text.toString()

            if (firstnumber.isEmpty() && secondnumber.isEmpty()){
                Txt_Answer.text="Invalid Input"
                }else{
                    var answer= firstnumber.toDouble() + secondnumber.toDouble()
                Txt_Answer.text= answer.toString()
            }
        }
        button5sub.setOnClickListener {
            var firstnumber=numbernum1.text.toString()
            var secondnumber=numbernum2.text.toString()

            if (firstnumber.isEmpty() && secondnumber.isEmpty()){
                Txt_Answer.text="Invalid Input"
            }else{
                var answer= firstnumber.toDouble() - secondnumber.toDouble()
                Txt_Answer.text= answer.toString()
            }
        }
        button11mult.setOnClickListener {
            var firstnumber=numbernum1.text.toString()
            var secondnumber=numbernum2.text.toString()

            if (firstnumber.isEmpty() && secondnumber.isEmpty()){
                Txt_Answer.text="Invalid Input"
            }else{
                var answer= firstnumber.toDouble() * secondnumber.toDouble()
                Txt_Answer.text= answer.toString()
            }
        }
        button12div.setOnClickListener {
            var firstnumber=numbernum1.text.toString()
            var secondnumber=numbernum2.text.toString()

            if (firstnumber.isEmpty() && secondnumber.isEmpty()){
                Txt_Answer.text="Invalid Input"
            }else{
                var answer= firstnumber.toDouble() / secondnumber.toDouble()
                Txt_Answer.text= answer.toString()
            }
        }

    }
}