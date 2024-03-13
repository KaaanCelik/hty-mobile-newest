package com.hilalcifci.thy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilalcifci.thy3.databinding.ActivityLoginpageBinding

class activity_loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginpageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.secondActBtn.setOnClickListener{
            intent= Intent(applicationContext,activity_menu1::class.java)
            startActivity(intent)

        }
    }
}