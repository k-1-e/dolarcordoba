package com.example.dolarcorodba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Calcular(view: View) {

        var Resultado : Double
        var Tipocambio = findViewById<EditText>(R.id.edtcambio)
        var cantidad = findViewById<EditText>(R.id.edtcantidad)
        var resultado = findViewById<TextView>(R.id.edtresultado)
       // var convertir = findViewById<Button>(R.id.btnconvertir)
        var cordobasadolar = findViewById<RadioButton>(R.id.cordobasdolar)
        var dolaresacordobas = findViewById<RadioButton>(R.id.dolarcordobas)



        var opcion = findViewById<RadioButton>(R.id.cordobasdolar)

        if (cordobasadolar.isChecked){
            Resultado = ((cantidad.text.toString().toDouble())/(Tipocambio.text.toString().toDouble()))
            resultado.setText(Resultado.toString())
        } else if (dolaresacordobas.isChecked) {
            Resultado = ((cantidad.text.toString().toDouble())*(Tipocambio.text.toString().toDouble()))
            resultado.setText(Resultado.toString())
        } else {
            resultado.setText("Por favor, seleccione opción de moneda a convertir")
        }


    }

}