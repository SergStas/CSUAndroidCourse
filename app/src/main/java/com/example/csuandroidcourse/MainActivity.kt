package com.example.csuandroidcourse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.csuandroidcourse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mainTvText.text = "asdasda"

        binding.mainBSend.setOnClickListener {
            val text = binding.mainEtText.text.toString()
            if (text.isNotEmpty()) {
                startActivity(
                    Intent(this, SecondActivity::class.java)
                        .apply {
                            putExtra("text", text)
                        },
                )
            }
        }
    }
}