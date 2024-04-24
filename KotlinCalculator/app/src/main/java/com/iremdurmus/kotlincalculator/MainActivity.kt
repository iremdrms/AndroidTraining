package com.iremdurmus.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.iremdurmus.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number1 : Double? = null
    var number2 : Double? = null
    var result : Double? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }

    fun mySum (view: View) {
        number1 = binding.number1Text.text.toString().toDoubleOrNull()
        number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null)
        {
            val result = number1!! + number2!!
            binding.textView.text = result.toString()
        } else
        {
            binding.textView.text = "Enter number!!"
        }
    }
    fun mySub (view: View) {}
    fun myMultiply (view: View) {}
    fun myDiv (view: View) {}
}