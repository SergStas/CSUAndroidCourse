package com.example.csuandroidcourse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.csuandroidcourse.databinding.ActivitySecondBinding

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sndTvText.text = intent.getStringExtra("text") ?: "No data"
    }
}