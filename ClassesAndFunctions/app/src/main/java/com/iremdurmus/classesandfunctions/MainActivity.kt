package com.iremdurmus.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var myTextView: TextView
    private lateinit var myButton: Button
    private lateinit var nameText: EditText
    private lateinit var ageText: EditText
    private lateinit var jobText: EditText
    var name = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button)
        nameText = findViewById(R.id.nameText)
        ageText = findViewById(R.id.ageText)
        jobText = findViewById(R.id.jobText)
        /*
        myButton.setOnClickListener()
        {
            myTextView.text = " Button Clicked 2"
        }

         */

        //1) code block, reusable 2)input 3)output-return
        //println("hello kotlin")
        test()
        mySum(10, 5)
        val sumResult = mySum(40, 49)
        //val result = myMultiply(12,3)

        //Class


        val homer = Simpson("homer", 12, "doctor")

        homer.name = "irem"
        println(homer.name)
        //homer.height =190 //private olduğu için aynı class içerisinden erişebilirsin

        homer.setHeight(12)

        //Nullability
        var myString: String? = null
        myString = "test"
        println(myString)

        var myAge: Int? = null
        //myAge = 50
        // !!  ?

        //1) !!
        // println(myAge!! * 10)

        //2) safe call
        //println(myAge?.minus(10))

        //3)

        if (myAge != null) {
            println(myAge.minus(10))
        } else {
            println("myAge is null")
        }

        //4) elvis operator
        println(myAge?.minus(10) ?: -10)

        //5)
        myAge?.let {
            println(it * 10)
        }


    }

    fun test() {
        //println("test function")
    }

    fun mySum(a: Int, b: Int) {

        myTextView.text = "Result: ${a + b}"
    }

    fun myMultiply(x: Int, y: Int): Int {

        val result = x * y
        myTextView.text = "Result: ${result}"

        return result

    }

    fun buttonClicked(view: View) {
        name = nameText.text.toString()
        val age = ageText.text.toString().toIntOrNull()
        val job = jobText.text.toString()



            if (age != null) {
                val simpson = Simpson(name, age, job)
                myTextView.text = "Name : ${simpson.name} Age : ${simpson.age} Job : ${simpson.job}"
            } else
                myTextView.text = "enter your age correctly!"
    }
}