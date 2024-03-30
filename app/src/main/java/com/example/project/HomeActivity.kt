package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.project.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replacefragment(home())
        binding.bottomNavigationView3.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->replacefragment(home())
                R.id.stats->replacefragment(stats())
                R.id.settings->replacefragment(settings())

                else->{

                }
            }
            true
        }

    }

    private fun replacefragment(fragment:Fragment){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }
}