package com.hilalcifci.thy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilalcifci.thy3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.registerbutton.setOnClickListener{
            intent= Intent(applicationContext,Mainregister::class.java)
            startActivity(intent)
        }
        binding.forgetpasswordbutton.setOnClickListener{
            intent= Intent(applicationContext,MainForgetPassword::class.java)
            startActivity(intent)
        }
        binding.loginbutton.setOnClickListener{
            intent= Intent(applicationContext,activity_qr_scanner::class.java)
            startActivity(intent)
        }

    }
}