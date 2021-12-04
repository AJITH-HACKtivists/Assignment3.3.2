package com.example.forthapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import java.lang.Exception
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val click=findViewById<Button>(R.id.button)
        val guess=findViewById<TextInputLayout>(R.id.number)
        var view=findViewById<TextView>(R.id.text1)
        val num= Random.nextInt(1,1000)
        click.setOnClickListener{
            view.setText("")
            val guess1=guess.editText?.text?.toString()
            try {
                view.text=" "
                val guess2= if(guess1.isNullOrEmpty()) -1
                else guess1.toInt()

                    if(guess2!=-1) {
                        if (guess2 == num) {
                            view.text = "You are right!!"
                        }
                        else if (guess2 < num) {
                            view.text = "No :) the number is bigger"
                        } else
                            view.text = "No :) the number is smaller"
                    }
                    else
                        view.text="Please Enter a number"

            }
            catch (e: Exception){
                view.text="Please Enter a number"
            }

        }
    }
}