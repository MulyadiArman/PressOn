package com.example.myapplication.views.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityLoginBinding
import com.example.myapplication.views.forgotpass.ForgotPasswordActivity
import com.example.myapplication.views.main.MainActivity
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()
    }

    private fun onClick() {
        binding.btnLogin.setOnClickListener {
            startActivity<MainActivity>()
        }

        binding.btnForgotPassword.setOnClickListener {
            startActivity<ForgotPasswordActivity>()
        }
    }
}