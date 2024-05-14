package com.iremdurmus.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iremdurmus.landmarkbookkotlin.databinding.ActivityDetailsBinding
import com.iremdurmus.landmarkbookkotlin.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intent = intent

        //casting
        //val selectedLandmark =intent.getSerializableExtra("landmark") as Landmark

        //val selectedLandmark = chosenLandmark
        val selectedLandmark = MySingleton.chosenLandmark
        selectedLandmark?.let {
            binding.nameText.text = it.name
            binding.nameText2.text = it.country
            binding.imageView.setImageResource(it.image)
        }

    }
}