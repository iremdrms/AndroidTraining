package com.iremdurmus.kennyyakala

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.iremdurmus.kennyyakala.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var handler: Handler = Handler(Looper.getMainLooper())
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        
        object : CountDownTimer(16000,1000) {
            override fun onTick(p0: Long) {
                binding.timeView.text = "Time : ${p0/1000}" }
            override fun onFinish() {
                val alert = AlertDialog.Builder(this@MainActivity)
                alert.setTitle("Game Over")
                alert.setMessage("Restart The Game?")
                alert.setPositiveButton("Yes", object : DialogInterface.OnClickListener {
                    override fun onClick(p0: DialogInterface?, p1: Int) {
                        val intent = Intent(this@MainActivity,MainActivity::class.java)
                        startActivity(intent)
                        finish() } })
                alert.setNegativeButton("No") { p0, p1 ->
                    Toast.makeText(this@MainActivity,"GAME OVER!",Toast.LENGTH_LONG).show() }
                alert.show() } }.start()
        var kennyImage = binding.imageView5
        handler.postDelayed(object : Runnable {
            override fun run() {
                val randomX = Random.nextInt(binding.root.width - kennyImage.width)
                val randomY = Random.nextInt(binding.root.height - kennyImage.height)+200
                // Rastgele koordinatları ayarlama
                kennyImage.x = randomX.toFloat()
                kennyImage.y = randomY.toFloat()
                // Bir sonraki çağrıyı geciktirme
                handler.postDelayed(this, 1000)//1000 milisaniyede bir çağrılıyor(1 saniye) }
        }, 1000) // İlk çağrıyı 1 saniye sonra yap

    }

    fun clicked(view: View)
    {
        score += 1
        binding.scoreView.text = "Score: ${score}"


    }
}