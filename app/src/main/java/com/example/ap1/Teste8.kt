package com.example.ap1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.ap1.databinding.ActivityTeste8Binding

class Teste8 : AppCompatActivity() {

    private lateinit var binding: ActivityTeste8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeste8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var resultadoTeste1 = intent.getIntExtra("resultadoTeste1", 0)
        var resultadoTeste2 = intent.getIntExtra("resultadoTeste2", 0)
        var resultadoTeste3 = intent.getIntExtra("resultadoTeste3", 0)
        var resultadoTeste4 = intent.getIntExtra("resultadoTeste4", 0)
        var resultadoTeste5 = intent.getIntExtra("resultadoTeste5", 0)
        var resultadoTeste6 = intent.getIntExtra("resultadoTeste6", 0)
        var resultadoTeste7 = intent.getIntExtra("resultadoTeste7", 0)
        var resultadoTeste8: Int = 0

        binding.teste.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
            }
        )

        binding.proximo.setOnClickListener {

            var id: Int = binding.teste.checkedRadioButtonId

            if (id == R.id.radioButton1) {
                resultadoTeste8 = 1
            } else if (id == R.id.radioButton2) {
                resultadoTeste8 = 2
            } else if (id == R.id.radioButton3) {
                resultadoTeste8 = 3
            } else if (id == R.id.radioButton4) {
                resultadoTeste8 = 4
            } else if (id == R.id.radioButton5) {
                resultadoTeste8 = 5
            } else if (id == R.id.radioButton6) {
                resultadoTeste8 = 7
            } else {
                Toast.makeText(
                    applicationContext,
                    "Obrigatório selecionar um campo",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if (id != -1) {
                val navegarLastActivity = Intent(this, LastActivity::class.java)
                navegarLastActivity.putExtra("resultadoTeste1", resultadoTeste1)
                navegarLastActivity.putExtra("resultadoTeste2", resultadoTeste2)
                navegarLastActivity.putExtra("resultadoTeste3", resultadoTeste3)
                navegarLastActivity.putExtra("resultadoTeste4", resultadoTeste4)
                navegarLastActivity.putExtra("resultadoTeste5", resultadoTeste5)
                navegarLastActivity.putExtra("resultadoTeste6", resultadoTeste6)
                navegarLastActivity.putExtra("resultadoTeste7", resultadoTeste7)
                navegarLastActivity.putExtra("resultadoTeste8", resultadoTeste8)
                startActivity(navegarLastActivity)
            }
        }
    }
}