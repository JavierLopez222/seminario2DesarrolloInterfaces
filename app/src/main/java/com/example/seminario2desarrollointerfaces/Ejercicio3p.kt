package com.example.seminario2desarrollointerfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Ejercicio3p : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3p)

        var mostrarLista = findViewById<TextView>(R.id.listaRecibidaTextView)
        var recibirLista = intent.getStringExtra("Lista")

        mostrarLista.text = recibirLista.toString().replace("[","").replace("]","")
    }
}