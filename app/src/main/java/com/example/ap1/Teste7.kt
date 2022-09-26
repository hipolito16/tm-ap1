package com.example.ap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.ap1.databinding.ActivityTeste7Binding

class Teste7 : AppCompatActivity() {

    private lateinit var binding: ActivityTeste7Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeste7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var resultadoTeste1 = intent.getIntExtra("resultadoTeste1", 0)
        var resultadoTeste2 = intent.getIntExtra("resultadoTeste2", 0)
        var resultadoTeste3 = intent.getIntExtra("resultadoTeste3", 0)
        var resultadoTeste4 = intent.getIntExtra("resultadoTeste4", 0)
        var resultadoTeste5 = intent.getIntExtra("resultadoTeste5", 0)
        var resultadoTeste6 = intent.getIntExtra("resultadoTeste6", 0)
        var resultadoTeste7: Int = 0

        binding.teste.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
            }
        )

        binding.proximo.setOnClickListener {

            var id: Int = binding.teste.checkedRadioButtonId

            if (id == R.id.radioButton1) {
                resultadoTeste7 = 1
            } else if (id == R.id.radioButton2) {
                resultadoTeste7 = 2
            } else if (id == R.id.radioButton3) {
                resultadoTeste7 = 3
            } else if (id == R.id.radioButton4) {
                resultadoTeste7 = 4
            } else if (id == R.id.radioButton5) {
                resultadoTeste7 = 6
            } else if (id == R.id.radioButton6) {
                resultadoTeste7 = 7
            } else {
                Toast.makeText(
                    applicationContext,
                    "Obrigatório selecionar um campo",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if (id != -1) {
                val navegarTeste8 = Intent(this, Teste8::class.java)
                navegarTeste8.putExtra("resultadoTeste1", resultadoTeste1)
                navegarTeste8.putExtra("resultadoTeste2", resultadoTeste2)
                navegarTeste8.putExtra("resultadoTeste3", resultadoTeste3)
                navegarTeste8.putExtra("resultadoTeste4", resultadoTeste4)
                navegarTeste8.putExtra("resultadoTeste5", resultadoTeste5)
                navegarTeste8.putExtra("resultadoTeste6", resultadoTeste6)
                navegarTeste8.putExtra("resultadoTeste7", resultadoTeste7)
                startActivity(navegarTeste8)
            }
        }
    }
}