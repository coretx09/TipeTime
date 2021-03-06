package com.example.tipetime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.tipetime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ecouteur de click
        binding.calculateButton.setOnClickListener{calculateTip()}

    }

    // function d'assistance
    private fun calculateTip() {
        val stringInTextField = binding.costOfService.text
    }

}

