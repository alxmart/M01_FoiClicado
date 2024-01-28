package com.luizafmartinez.m01_foiclicado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clicar(view: View) {
        println("O botão foi clicado!")
        Toast.makeText(this, "Foi Clicado!!", Toast.LENGTH_SHORT).show()
    }

}