package com.hilalcifci.thy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.hilalcifci.thy3.databinding.ActivityMainregisterBinding

class Mainregister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainregisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.turnBackButton.setOnClickListener{
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
        binding.registerButton.setOnClickListener{
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}