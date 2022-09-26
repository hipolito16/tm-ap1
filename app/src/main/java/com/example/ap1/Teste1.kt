package com.example.ap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.ap1.databinding.ActivityTeste1Binding

class Teste1 : AppCompatActivity() {

    private lateinit var binding: ActivityTeste1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeste1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var resultadoTeste1: Int = 0

        binding.teste.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
            }
        )

        binding.proximo.setOnClickListener {

            var id: Int = binding.teste.checkedRadioButtonId

            if (id == R.id.radioButton1) {
                resultadoTeste1 = 1
            } else if (id == R.id.radioButton2) {
                resultadoTeste1 = 2
            } else if (id == R.id.radioButton3) {
                resultadoTeste1 = 3
            } else if (id == R.id.radioButton4) {
                resultadoTeste1 = 4
            } else if (id == R.id.radioButton5) {
                resultadoTeste1 = 6
            } else if (id == R.id.radioButton6) {
                resultadoTeste1 = 8
            } else {
                Toast.makeText(
                    applicationContext,
                    "Obrigatório selecionar um campo",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if (id != -1) {
                val navegarTeste2 = Intent(this, Teste2::class.java)
                navegarTeste2.putExtra("resultadoTeste1", resultadoTeste1)
                startActivity(navegarTeste2)
            }
        }
    }
}