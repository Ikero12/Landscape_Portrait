package com.iker.landscape_portrait

import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.graphics.drawable.GradientDrawable.Orientation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        title="AppPeruana"
        val orientacion = this.resources.configuration.orientation
        var elTexto: TextView = findViewById(R.id.textoAmbulante)
        if(orientacion == Configuration.ORIENTATION_LANDSCAPE){
            elTexto.text="El móvil está tumbado"
        }else if (orientacion == Configuration.ORIENTATION_PORTRAIT){
            elTexto.text="El móvil está de pie"
        }

    }
}