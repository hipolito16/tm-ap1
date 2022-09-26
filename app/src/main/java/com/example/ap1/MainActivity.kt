package com.example.ap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ap1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iniciarTeste.setOnClickListener {
            val navegarTeste1 = Intent(this, Teste1::class.java)
            startActivity(navegarTeste1)
        }

        binding.sair.setOnClickListener {
            finishAffinity()
        }
    }
}