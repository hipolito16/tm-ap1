package com.example.ap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.ap1.databinding.ActivityTeste3Binding

class Teste3 : AppCompatActivity() {

    private lateinit var binding: ActivityTeste3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeste3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var resultadoTeste1 = intent.getIntExtra("resultadoTeste1", 0)
        var resultadoTeste2 = intent.getIntExtra("resultadoTeste2", 0)
        var resultadoTeste3: Int = 0

        binding.proximo.setOnClickListener {

            var id: Int = binding.teste.checkedRadioButtonId

            if (id == R.id.radioButton1) {
                resultadoTeste3 = 0
            } else if (id == R.id.radioButton2) {
                resultadoTeste3 = 1
            } else if (id == R.id.radioButton3) {
                resultadoTeste3 = 2
            } else if (id == R.id.radioButton4) {
                resultadoTeste3 = 3
            } else if (id == R.id.radioButton5) {
                resultadoTeste3 = 5
            } else if (id == R.id.radioButton6) {
                resultadoTeste3 = 7
            } else {
                Toast.makeText(
                    applicationContext,
                    "Obrigatório selecionar um campo",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if (id != -1) {
                val navegarTeste4 = Intent(this, Teste4::class.java)
                navegarTeste4.putExtra("resultadoTeste1", resultadoTeste1)
                navegarTeste4.putExtra("resultadoTeste2", resultadoTeste2)
                navegarTeste4.putExtra("resultadoTeste3", resultadoTeste3)
                startActivity(navegarTeste4)
            }
        }
    }
}