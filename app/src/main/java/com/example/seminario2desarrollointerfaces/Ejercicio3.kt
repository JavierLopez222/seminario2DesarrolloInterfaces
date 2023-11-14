package com.example.seminario2desarrollointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        val intent = Intent(this, Ejercicio3p::class.java)
        var etDatos = findViewById<EditText>(R.id.textoEditText)
        var btnAgregarLista = findViewById<Button>(R.id.agregarLista)
        var btnEnviarDatos = findViewById<Button>(R.id.pasarDatos)
        var tvLista = findViewById<TextView>(R.id.textViewLista)
        var listaDatos = mutableListOf<String>()

        btnAgregarLista.setOnClickListener{
            listaDatos.add(etDatos.text.toString())
            etDatos.text.clear()
            tvLista.text = listaDatos.toString().replace("[","").replace("]","")
        }
        btnEnviarDatos.setOnClickListener{
            intent.putExtra("Lista",listaDatos.toString())
            startActivity(intent)
        }
    }
}