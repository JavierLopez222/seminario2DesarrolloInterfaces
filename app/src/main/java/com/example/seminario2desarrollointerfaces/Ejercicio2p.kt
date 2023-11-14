package com.example.seminario2desarrollointerfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Ejercicio2p : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2p)

        val numero = findViewById<TextView>(R.id.tvRecibirNumero)
        val texto = findViewById<TextView>(R.id.tvRecibirFrase)

        val numeroARecuperar = intent.getStringExtra("Numero")
        numero.setText(numeroARecuperar.toString())

        val textoARecuperar = intent.getStringExtra("Frase")
        texto.setText(textoARecuperar.toString())
    }
}