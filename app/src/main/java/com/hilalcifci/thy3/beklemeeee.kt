package com.hilalcifci.thy3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilalcifci.thy3.databinding.ActivityBeklemeeeeBinding

class beklemeeee : AppCompatActivity() {
    lateinit var binding: ActivityBeklemeeeeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBeklemeeeeBinding.inflate(layoutInflater)
    }
}
