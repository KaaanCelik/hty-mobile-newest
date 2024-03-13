
package com.hilalcifci.thy3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilalcifci.thy3.databinding.ActivityMainForgetPasswordBinding
import com.hilalcifci.thy3.databinding.ActivityMainregisterBinding

class MainForgetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainForgetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.forgetpaswordTurnBack.setOnClickListener{
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
        binding.forgatpassworRecoder.setOnClickListener{
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}