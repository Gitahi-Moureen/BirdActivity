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

class bridFour : AppCompatActivity() {

    lateinit var binding: ActivityBridFourBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBridFourBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnPrev2.setOnClickListener {
            finish()
        }
        binding.btnNext2.setOnClickListener {
            val intent = Intent(this,ActivityBridFourBinding::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1516233758813-a38d024919c5?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .fit()
            .into(binding.imageView10)

    }
}