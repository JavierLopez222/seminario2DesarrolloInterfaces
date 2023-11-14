package com.example.seminario2desarrollointerfaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val ma1 = findViewById<Button>(R.id.ma1)
        val ma3 = findViewById<Button>(R.id.ma3)
        val ma4 = findViewById<Button>(R.id.ma4)
        val ma5 = findViewById<Button>(R.id.ma5)
        val ej1 = findViewById<Button>(R.id.ejercicio1)
        val ej2 = findViewById<Button>(R.id.ejercicio2)
        val ej3 = findViewById<Button>(R.id.ejercicio3)
        val ej4 = findViewById<Button>(R.id.ejercicio4)

        ma1.setOnClickListener{
            val intent = Intent(this, Maqueta1::class.java)
            startActivity(intent)
        }
        ma3.setOnClickListener{
            val intent = Intent(this, Maqueta3::class.java)
            startActivity(intent)
        }
        ma4.setOnClickListener{
            val intent = Intent(this, Maqueta4::class.java)
            startActivity(intent)
        }
        ma5.setOnClickListener{
            val intent = Intent(this, Maqueta5::class.java)
            startActivity(intent)
        }
        ej1.setOnClickListener{
            val intent = Intent(this, TresEnRaya::class.java)
            startActivity(intent)
        }
        ej2.setOnClickListener{
            val intent = Intent(this, Ejercicio2::class.java)
            startActivity(intent)
        }
        ej3.setOnClickListener{
            val intent = Intent(this, Ejercicio3::class.java)
            startActivity(intent)
        }
        ej4.setOnClickListener{
            val intent = Intent(this, Ejercicio4::class.java)
            startActivity(intent)
        }
    }
}