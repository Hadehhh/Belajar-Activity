package com.example.belajaractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Lifecycle
import com.example.belajaractivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.button1.setOnClickListener {
            sendMessage()
        }
        setContentView(binding.root)
        Log.d("Lifecycle", "OnCreate dimulai")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "OnStart dimulai")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "OnResume dimulai")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "OnPause dimulai")
    }

    override fun onRestart() {
        super.onRestart()
        binding.etNama.setText("")
        Log.d("Lifecycle", "OnRestart dimulai")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "OnStop dimulai")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "OnDestroy dimulai")
    }

    fun sendMessage() {
        val nama = binding.etNama.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("nama", nama)
        startActivity(intent)
    }
}