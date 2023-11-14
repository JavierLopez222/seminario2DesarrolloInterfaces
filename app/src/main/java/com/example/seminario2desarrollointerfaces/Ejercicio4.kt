package com.example.seminario2desarrollointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.Button
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pais(val nombre:String, val bandera: Int, val habitantes: String): Parcelable

class Ejercicio4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)

        val intent = Intent(this, Ejercicio4p::class.java)
        val btnEspana = findViewById<Button>(R.id.btnEspaña)
        val btnFrancia = findViewById<Button>(R.id.btnFrancia)

        btnEspana.setOnClickListener{
            intent.putExtra("paisEspana", Pais("España", 1, "48.521.743 habitantes"))
            intent.putExtra("paisElegido", 1)
            startActivity(intent)
        }
        btnFrancia.setOnClickListener{
            intent.putExtra("paisFrancia", Pais("Francia", 2, "67.230.000 habitantes"))
            intent.putExtra("paisElegido", 2)
            startActivity(intent)
        }
    }
}