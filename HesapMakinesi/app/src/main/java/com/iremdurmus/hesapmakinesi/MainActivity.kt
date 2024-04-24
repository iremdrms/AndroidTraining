package com.iremdurmus.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var num1EditText : EditText
    private lateinit var num2EditText : EditText
    private lateinit var myText: TextView

    private lateinit var topButton : Button
    private lateinit var cikButton : Button
    private lateinit var bolButton : Button
    private lateinit var carpButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1EditText = findViewById(R.id.editText)
        num2EditText = findViewById(R.id.editText2)
        myText = findViewById(R.id.textView)
        topButton = findViewById(R.id.toplaButton)
        cikButton = findViewById(R.id.cikarButton)
        bolButton = findViewById(R.id.bolmeButton)
        carpButton = findViewById(R.id.carpmaButton)



        topButton.setOnClickListener {
            Topla()
        }

        cikButton.setOnClickListener {
            Cikar()
        }

        bolButton.setOnClickListener {
            Bol()
        }
        carpButton.setOnClickListener {
            Carp()
        }



    }




    fun Topla()
    {

        val num1 = num1EditText.text.toString().toDoubleOrNull()
        val num2 = num2EditText.text.toString().toDoubleOrNull()

        if (num1 != null && num2 != null)
        {
            val result = num1 + num2
            myText.text = result.toString()
        }
        else
        {
            myText.text = "enter number"
        }





    }

    fun Cikar ()
    {
        val num1 = num1EditText.text.toString().toDoubleOrNull()
        val num2 = num2EditText.text.toString().toDoubleOrNull()

        if (num1 != null && num2 != null)
        {
            val result = num1 - num2
            myText.text = result.toString()
        }
        else
        {
            myText.text = "enter number"
        }

    }

    fun Bol ()
    {
        val num1 = num1EditText.text.toString().toDoubleOrNull()
        val num2 = num2EditText.text.toString().toDoubleOrNull()


        if (num1 != null && num2 != null)
        {
            val result = num1 / num2
            myText.text = result.toString()
        }
        else
        {
            myText.text = "enter number"
        }
    }
    fun Carp ()
    {
        val num1 = num1EditText.text.toString().toDoubleOrNull()
        val num2 = num2EditText.text.toString().toDoubleOrNull()

        if (num1 != null && num2 != null)
        {
            val result = num1 * num2
            myText.text = result.toString()
        }
        else
        {
            myText.text = "enter number"
        }
    }



    /*
    fun Topla() {
        val num1 = num1EditText.text.toString().toDoubleOrNull() ?: return
        val num2 = num2EditText.text.toString().toDoubleOrNull() ?: return

        val result = num1 + num2
        myText.text = result.toString()
    }

    fun Cikar() {
        val num1 = num1EditText.text.toString().toDoubleOrNull() ?: return
        val num2 = num2EditText.text.toString().toDoubleOrNull() ?: return

        val result = num1 - num2
        myText.text = result.toString()
    }

    fun Bol() {
        val num1 = num1EditText.text.toString().toDoubleOrNull() ?: return
        val num2 = num2EditText.text.toString().toDoubleOrNull() ?: return

        val result = num1 / num2
        myText.text = result.toString()
    }

    fun Carp() {
        val num1 = num1EditText.text.toString().toDoubleOrNull() ?: return
        val num2 = num2EditText.text.toString().toDoubleOrNull() ?: return

        val result = num1 * num2
        myText.text = result.toString()
    }


     */


}