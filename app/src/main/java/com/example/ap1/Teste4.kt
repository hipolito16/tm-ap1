package com.example.ap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.ap1.databinding.ActivityTeste4Binding

class Teste4 : AppCompatActivity() {

    private lateinit var binding: ActivityTeste4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeste4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var resultadoTeste1 = intent.getIntExtra("resultadoTeste1", 0)
        var resultadoTeste2 = intent.getIntExtra("resultadoTeste2", 0)
        var resultadoTeste3 = intent.getIntExtra("resultadoTeste3", 0)
        var resultadoTeste4: Int = 0

        binding.proximo.setOnClickListener {

            var id: Int = binding.teste.checkedRadioButtonId

            if (id == R.id.radioButton1) {
                resultadoTeste4 = 1
            } else if (id == R.id.radioButton2) {
                resultadoTeste4 = 2
            } else if (id == R.id.radioButton3) {
                resultadoTeste4 = 3
            } else if (id == R.id.radioButton4) {
                resultadoTeste4 = 5
            } else if (id == R.id.radioButton5) {
                resultadoTeste4 = 6
            } else if (id == R.id.radioButton6) {
                resultadoTeste4 = 8
            } else {
                Toast.makeText(
                    applicationContext,
                    "Obrigatório selecionar um campo",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if (id != -1) {
                val navegarTeste5 = Intent(this, Teste5::class.java)
                navegarTeste5.putExtra("resultadoTeste1", resultadoTeste1)
                navegarTeste5.putExtra("resultadoTeste2", resultadoTeste2)
                navegarTeste5.putExtra("resultadoTeste3", resultadoTeste3)
                navegarTeste5.putExtra("resultadoTeste4", resultadoTeste4)
                startActivity(navegarTeste5)
            }
        }
    }
}