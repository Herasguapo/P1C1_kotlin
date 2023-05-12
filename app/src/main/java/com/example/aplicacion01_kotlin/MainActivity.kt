package com.example.aplicacion01_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnSaludar: Button
    private lateinit var btnLimpiar: Button
    private lateinit var btnCerrar: Button
    private lateinit var lblSaludar: TextView
    private lateinit var txtNombre: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Relacion de los objetos Java con las vistas xml
        btnSaludar = findViewById(R.id.btnSaludar)
        btnLimpiar = findViewById(R.id.btnLimpiar)
        btnCerrar = findViewById(R.id.btnCerrar)
        lblSaludar = findViewById(R.id.lblSaludar)
        txtNombre = findViewById(R.id.txtNombre)
        //Codificar evento click boton
        btnSaludar.setOnClickListener {
            if (txtNombre.text.toString().isEmpty()) {
                //Falta capturar el nombre
                Toast.makeText(this@MainActivity, "Favor de ingresar el nombre", Toast.LENGTH_SHORT).show()
            } else {
                val saludar = txtNombre.text.toString()
                lblSaludar.text = "Hola $saludar, ¿Cómo estás?"
            }
        }
        //btn limpiar
        btnLimpiar.setOnClickListener {
            lblSaludar.text = ""
            txtNombre.text.clear()
            txtNombre.requestFocus()
        }
        //btn Cerrar
        btnCerrar.setOnClickListener {
            finish()
        }
    }
}
