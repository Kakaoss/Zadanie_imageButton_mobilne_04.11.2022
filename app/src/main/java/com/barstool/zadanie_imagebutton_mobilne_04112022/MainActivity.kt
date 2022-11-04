package com.barstool.zadanie_imagebutton_mobilne_04112022

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val przycisk1 = findViewById<ImageButton>(R.id.obrazek1)
        val przycisk2 = findViewById<ImageButton>(R.id.obrazek2)
        val przycisk3 = findViewById<ImageButton>(R.id.obrazek3)
        val przycisk4 = findViewById<ImageButton>(R.id.obrazek4)
        val przycisk5 = findViewById<ImageButton>(R.id.obrazek5)


    }
}