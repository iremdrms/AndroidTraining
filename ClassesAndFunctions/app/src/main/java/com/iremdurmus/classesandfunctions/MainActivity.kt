package com.iremdurmus.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var myTextView: TextView
    lateinit var myButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button)

        /*
        myButton.setOnClickListener()
        {
            myTextView.text = " Button Clicked 2"
        }

         */

        //1) code block, reusable 2)input 3)output-return
        //println("hello kotlin")
        test()
        mySum(10,5)
        val sumResult = mySum(40,49)
        //val result = myMultiply(12,3)

        //Class

        val homer = Simpson()
        homer.name = "Homer Simpson"
        homer.age = 50
        homer.job = "Nuclear"
        println(homer.name)
    }

    fun test()
    {
        //println("test function")
    }
    fun mySum(a : Int, b : Int)
    {

        myTextView.text = "Result: ${a+b}"
    }

    fun myMultiply (x : Int, y : Int) :Int
    {

        val result = x*y
        myTextView.text = "Result: ${result}"

        return result

    }
    fun buttonClicked(view: View)
    {
        myTextView.text = "button clicked"
    }
}