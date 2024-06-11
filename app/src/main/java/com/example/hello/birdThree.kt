package com.example.hello

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBirdThreeBinding
import com.example.hello.databinding.ActivityBirdTwoBinding
import com.example.hello.databinding.ActivityBridFourBinding
import com.squareup.picasso.Picasso

class birdThree : AppCompatActivity() {

    lateinit var binding: ActivityBirdThreeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirdThreeBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnPrev1.setOnClickListener {
            finish()
        }
        binding.btnNext1.setOnClickListener {
            val intent = Intent(this,ActivityBridFourBinding::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1555169062-013468b47731?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8YmlyZHxlbnwwfHwwfHx8MA%3D%3D")
            .into(binding.imageView2)

    }
}