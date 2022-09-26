package com.example.ap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.ap1.databinding.ActivityTeste2Binding

class Teste2 : AppCompatActivity() {

    private lateinit var binding: ActivityTeste2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeste2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var resultadoTeste1 = intent.getIntExtra("resultadoTeste1", 0)
        var resultadoTeste2: Int = 0

        binding.proximo.setOnClickListener {

            var id: Int = binding.teste.checkedRadioButtonId

            if (id == R.id.radioButton1) {
                resultadoTeste2 = 1
            } else if (id == R.id.radioButton2) {
                resultadoTeste2 = 2
            } else if (id == R.id.radioButton3) {
                resultadoTeste2 = 3
            } else if (id == R.id.radioButton4) {
                resultadoTeste2 = 4
            } else if (id == R.id.radioButton5) {
                resultadoTeste2 = 6
            } else if (id == R.id.radioButton6) {
                resultadoTeste2 = 7
            } else {
                Toast.makeText(
                    applicationContext,
                    "Obrigatório selecionar um campo",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if (id != -1) {
                val navegarTeste3 = Intent(this, Teste3::class.java)
                navegarTeste3.putExtra("resultadoTeste1", resultadoTeste1)
                navegarTeste3.putExtra("resultadoTeste2", resultadoTeste2)
                startActivity(navegarTeste3)
            }
        }
    }
}