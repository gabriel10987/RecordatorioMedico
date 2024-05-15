package com.miempresa.pulsecare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonAgregar: ImageButton = findViewById(R.id.agregar)
        botonAgregar.setOnClickListener {
            val intent = Intent(this, segundoActivity::class.java)
            startActivity(intent)
        }

        val botonVincular = findViewById<Button>(R.id.vincular)
        botonVincular.setOnClickListener {
            val intent = Intent(this, tercerActivity::class.java)
            startActivity(intent)
        }
    }
}