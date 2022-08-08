package com.example.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bookshelf.databinding.ActivitySplashBinding
import com.example.bookshelf.features.home.view.HomeFragment
import java.util.*

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Timer().schedule(object: TimerTask() {
            override fun run() {
                startActivity(Intent(this@SplashActivity, HomeFragment::class.java))
                finish()
            }
        }, 3500)
    }
}