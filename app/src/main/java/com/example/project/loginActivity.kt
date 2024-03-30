package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project.databinding.ActivityLoginBinding

class loginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.login.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
        binding.signup.setOnClickListener {
            startActivity(Intent(this,Sing_upActivity::class.java))
        }
    }
}