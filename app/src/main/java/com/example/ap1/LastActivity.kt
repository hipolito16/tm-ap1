package com.example.ap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.ap1.databinding.ActivityLastBinding

class LastActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var resultadoTeste1 = intent.getIntExtra("resultadoTeste1", 0)
        var resultadoTeste2 = intent.getIntExtra("resultadoTeste2", 0)
        var resultadoTeste3 = intent.getIntExtra("resultadoTeste3", 0)
        var resultadoTeste4 = intent.getIntExtra("resultadoTeste4", 0)
        var resultadoTeste5 = intent.getIntExtra("resultadoTeste5", 0)
        var resultadoTeste6 = intent.getIntExtra("resultadoTeste6", 0)
        var resultadoTeste7 = intent.getIntExtra("resultadoTeste7", 0)
        var resultadoTeste8 = intent.getIntExtra("resultadoTeste8", 0)

        var resultadoFinal: Int =
            resultadoTeste1 + resultadoTeste2 + resultadoTeste3 + resultadoTeste4 + resultadoTeste5 + resultadoTeste6 + resultadoTeste7 + resultadoTeste8

        if (resultadoFinal in 6..11) {
            binding.resultado2.text = "Sem risco"
        } else if (resultadoFinal in 12..17) {
            binding.resultado2.text = "Risco abaixo da média"
        } else if (resultadoFinal in 18..24) {
            binding.resultado2.text = "Risco médio"
        } else if (resultadoFinal in 25..31) {
            binding.resultado2.text = "Risco moderado"
        } else if (resultadoFinal in 32..40) {
            binding.resultado2.text = "Risco alto"
        } else if (resultadoFinal in 41..62) {
            binding.resultado2.text = "Risco muito alto"
        }

        binding.resultado.text = "Resultado Final: " + resultadoFinal

        binding.reiniciar.setOnClickListener {
            val reiniciar = Intent(this, MainActivity::class.java)
            startActivity(reiniciar)
        }

        binding.sair.setOnClickListener {
            finishAffinity()
        }
    }
}