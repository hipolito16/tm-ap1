package com.example.ap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.ap1.databinding.ActivityTeste6Binding

class Teste6 : AppCompatActivity() {

    private lateinit var binding: ActivityTeste6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeste6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var resultadoTeste1 = intent.getIntExtra("resultadoTeste1", 0)
        var resultadoTeste2 = intent.getIntExtra("resultadoTeste2", 0)
        var resultadoTeste3 = intent.getIntExtra("resultadoTeste3", 0)
        var resultadoTeste4 = intent.getIntExtra("resultadoTeste4", 0)
        var resultadoTeste5 = intent.getIntExtra("resultadoTeste5", 0)
        var resultadoTeste6: Int = 0

        binding.proximo.setOnClickListener {

            var id: Int = binding.teste.checkedRadioButtonId

            if (id == R.id.radioButton1) {
                resultadoTeste6 = 1
            } else if (id == R.id.radioButton2) {
                resultadoTeste6 = 2
            } else if (id == R.id.radioButton3) {
                resultadoTeste6 = 3
            } else if (id == R.id.radioButton4) {
                resultadoTeste6 = 4
            } else if (id == R.id.radioButton5) {
                resultadoTeste6 = 6
            } else if (id == R.id.radioButton6) {
                resultadoTeste6 = 8
            } else {
                Toast.makeText(
                    applicationContext,
                    "Obrigatório selecionar um campo",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if (id != -1) {
                val navegarTeste7 = Intent(this, Teste7::class.java)
                navegarTeste7.putExtra("resultadoTeste1", resultadoTeste1)
                navegarTeste7.putExtra("resultadoTeste2", resultadoTeste2)
                navegarTeste7.putExtra("resultadoTeste3", resultadoTeste3)
                navegarTeste7.putExtra("resultadoTeste4", resultadoTeste4)
                navegarTeste7.putExtra("resultadoTeste5", resultadoTeste5)
                navegarTeste7.putExtra("resultadoTeste6", resultadoTeste6)
                startActivity(navegarTeste7)
            }
        }
    }
}