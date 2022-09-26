package com.example.ap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.ap1.databinding.ActivityTeste5Binding

class Teste5 : AppCompatActivity() {

    private lateinit var binding: ActivityTeste5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeste5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var resultadoTeste1 = intent.getIntExtra("resultadoTeste1", 0)
        var resultadoTeste2 = intent.getIntExtra("resultadoTeste2", 0)
        var resultadoTeste3 = intent.getIntExtra("resultadoTeste3", 0)
        var resultadoTeste4 = intent.getIntExtra("resultadoTeste4", 0)
        var resultadoTeste5: Int = 0

        binding.proximo.setOnClickListener {

            var id: Int = binding.teste.checkedRadioButtonId

            if (id == R.id.radioButton1) {
                resultadoTeste5 = 0
            } else if (id == R.id.radioButton2) {
                resultadoTeste5 = 1
            } else if (id == R.id.radioButton3) {
                resultadoTeste5 = 2
            } else if (id == R.id.radioButton4) {
                resultadoTeste5 = 4
            } else if (id == R.id.radioButton5) {
                resultadoTeste5 = 6
            } else if (id == R.id.radioButton6) {
                resultadoTeste5 = 10
            } else {
                Toast.makeText(
                    applicationContext,
                    "Obrigatório selecionar um campo",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if (id != -1) {
                val navegarTeste6 = Intent(this, Teste6::class.java)
                navegarTeste6.putExtra("resultadoTeste1", resultadoTeste1)
                navegarTeste6.putExtra("resultadoTeste2", resultadoTeste2)
                navegarTeste6.putExtra("resultadoTeste3", resultadoTeste3)
                navegarTeste6.putExtra("resultadoTeste4", resultadoTeste4)
                navegarTeste6.putExtra("resultadoTeste5", resultadoTeste5)
                startActivity(navegarTeste6)
            }
        }
    }
}