package com.example.myapplication.views.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.myapplication.views.splash.SplashActivity
import com.example.myapplication.R

import com.example.myapplication.views.login.LoginActivity
import com.example.myapplication.views.main.MainActivity
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(intent)
        },3000)
    }
}

