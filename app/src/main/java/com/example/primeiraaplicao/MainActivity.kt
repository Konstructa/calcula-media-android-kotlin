package com.example.primeiraaplicao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultados


        btCalcular.setOnClickListener {
            val primeiraNota = (primeiraNota.text.toString()).toDouble()
            val segundaNota = (segundaNota.text.toString()).toDouble()
            val media = (primeiraNota + segundaNota) / 2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >= 6 && faltas <= 10) {
                resultados.setText("O aluno foi aprovado\n Nota final: $media\n Faltas: $faltas")
            } else {
                resultados.setText("O aluno foi reprovado\n Nota final: $media\n Faltas: $faltas")
            }
        }

    }
}
