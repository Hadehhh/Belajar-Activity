package com.example.belajaractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajaractivity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)

        val name = intent.getStringExtra("nama")
        binding.Nama2.text = name.toString()
        setContentView(binding.root)
    }
}