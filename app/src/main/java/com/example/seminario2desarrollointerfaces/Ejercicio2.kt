package com.example.seminario2desarrollointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Ejercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val etNumero = findViewById<EditText>(R.id.etNumero)
            val numero = etNumero.text.toString()
            val etTexto =
                "Hemos recibido la frase: " + findViewById<EditText>(R.id.etTexto).text.toString()
            val intent = Intent(this, Ejercicio2p::class.java)
            intent.putExtra("Numero", numero)
            intent.putExtra("Frase", etTexto)


            startActivity(intent)
        }
    }
}