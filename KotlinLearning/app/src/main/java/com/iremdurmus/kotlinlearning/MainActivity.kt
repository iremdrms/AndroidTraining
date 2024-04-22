package com.iremdurmus.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables && Constants
        //integer
        var x = 5.0
        var y = 4
        //println(x * y)
        var age = 35
        val result = age / 7 * 5
        //println(result)

        //defining
        var myInteger : Int
        //initialize
        myInteger = 10
        myInteger = 20
        val a : Int = 5
        // a  = 10 yapamazsın
        val b : Int = 23
        //println(b/2)

        //long
        var myLong = 100
        //double and float
        val pi = 3.14
        println(pi*2.0)
        val myFloat = 3.14f
        println(myFloat*2)
        var myAge : Double = 23.0
        println(myAge/2)

        //String
        println("-----String-----")

        val myString = "irem Durmuş"
        val name = "james"
        val surname = "hetfield"

        val fullname = name + " " +surname
        println(fullname)

        var larsName : String = "Lars"

        println(myString.capitalize())

        //boolean
        println("-----Boolean-----")
        var myBoolean : Boolean = true
        myBoolean = false

        println(3 < 5)
        println(6 < 3)

        //conversion
        var myNumber = 5

        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger *2)

        //Collections

        //Arrays
        println("---------Array--------")

        val myArray = arrayOf("james","kirk","bob","lars")
        //index
        println( myArray[0])
        myArray[0] = "james hetfield"
        println(myArray[0])

        println( myArray.get(2))
        myArray.set(1,"kirk hammet")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])


        val myNewArray = doubleArrayOf(1.0,2.0,3.0)

        val mixedArray = arrayOf("atil",5)
        println(mixedArray[0])
        println(mixedArray[1])

        println("irem")

        //-------------------------------------------------------------
        //List

        println("-------List---------")

        val myMusician = arrayListOf<String>("irem","durmus")
        myMusician.add("james")
        myMusician.add(1,"ayşe")
        println(myMusician[1])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(0,12)
        myArrayList.add(1,23)

        println(myArrayList[1])

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add(0,"irem")
        myMixedArrayList.add(1,12)
        myMixedArrayList.add(2,true)

        println(myMixedArrayList[2])

        //Set

        println("-------Set---------")
        val myExampleArray = arrayOf(1,1,2,3,4)
        println("element 1: ${myExampleArray[0]}")
        println("element 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)
        println( mySet.size)
        //For Each
        mySet.forEach { println(it*3) }

        val myStringSet = HashSet<String>()
        myStringSet.add("irem")
        myStringSet.add("irem")
        println(myStringSet.size)

        //Map

        println("-------Map---------")

        //key-value
        val fruitArray = arrayOf("apple", "banana")
        val caloriesArray = arrayOf(100,200)

        println("${fruitArray[0]}  :  ${caloriesArray[0]}")

        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("elma",100)
        fruitCalorieMap.put("üzüm",200)
        println(fruitCalorieMap)

        val myHashMap = HashMap<String,String>()

        val myNewMap = hashMapOf<String,Int>("a" to 1,"b" to 2)
        println(myNewMap)

        //Operatörler

        println("-------------Operatörler--------")
        //remainder
        println(10%3)


        //If Control
        println("--------IF Control--------")

        val myNumberAge = 32

        if(myNumberAge < 30)
        {
            println("<30")
        }
        else if (myNumberAge >=30 && myNumberAge<40)
        {
            println(">=30 and <40")
        }
        else
        {
            println("sdasd")
        }

        //Switch - When
        println("------Switch/When------")

        val day =3
        var dayString =""
        /*
        if (day ==1)
        {
            dayString="monday"
        }
        else if (day ==2)
        {
            dayString="tuesday"
        }
        else if (day ==3)
        {
            dayString = "wednesday"
        }

         */

        when(day)
        {
            1->dayString = "monday"
            2->dayString = "tuesday"
            3->dayString = "wednesday"
            else->dayString=""
        }
        println(dayString)

        //Loops

        //For Loop
        println("------For------")

        val myArrayofNumbers = arrayOf(12,15,18,21,24,27,30,33)
        val q  = myArrayofNumbers[0] / 3 * 5
        println(q)

        for (number in myArrayofNumbers)
        {
            val z = number / 3 * 5
            println(z)
        }

        for (i in myArrayofNumbers.indices)
        {
            val qz = myArrayofNumbers[i] / 3 * 5
            println(qz)
        }

        for (b in 0..9)
        {
            println(b)
        }

        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("irem")
        myStringArrayList.add("durmus")
        myStringArrayList.add("asds")

        for (str in myStringArrayList)
        {
            println(str)
        }

        myStringArrayList.forEach { println(it) }

        //While Loop

        println("-------while loop")
        var j = 0

        while (j < 10)
        {

            println(j)
            j++

        }




    }



}