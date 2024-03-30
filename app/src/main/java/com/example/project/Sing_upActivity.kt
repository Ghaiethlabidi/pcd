package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project.databinding.ActivitySingUpBinding

class Sing_upActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySingUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySingUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.SignUp.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
        binding.login.setOnClickListener {
            startActivity(Intent(this,loginActivity::class.java))
        }
    }
}