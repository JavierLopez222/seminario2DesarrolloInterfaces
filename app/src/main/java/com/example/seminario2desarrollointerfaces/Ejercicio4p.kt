package com.example.seminario2desarrollointerfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Ejercicio4p : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4p)

        val paisEspania  = intent.getParcelableExtra<Pais>("paisEspana")
        val paisFrancia  = intent.getParcelableExtra<Pais>("paisFrancia")


        val tvNombrePais = findViewById<TextView>(R.id.tvNombrePais)
        val imgBandera = findViewById<ImageView>(R.id.banderas)
        val tvHabitantes = findViewById<TextView>(R.id.habitantes)

        val paisElegido = intent.getIntExtra("paisElegido", 0)

        if(paisElegido == 1){
            tvNombrePais.text=paisEspania?.nombre
            tvHabitantes.text=paisEspania?.habitantes.toString()
            imgBandera.setBackgroundResource(R.drawable.espana)
        }else{
            tvNombrePais.text=paisFrancia?.nombre
            tvHabitantes.text=paisFrancia?.habitantes.toString()
            imgBandera.setBackgroundResource(R.drawable.francia)
        }
    }
}