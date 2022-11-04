package com.barstool.zadanie_imagebutton_mobilne_04112022

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.graphics.alpha

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
        przycisk1.setOnClickListener {
            if (przycisk1.alpha.equals(0.5F)){
                przycisk1.alpha = 1F
            }
            else{
                przycisk1.alpha = 0.5F
            }
            Toast.makeText(baseContext, "kot", Toast.LENGTH_SHORT).show()
        }
        przycisk2.setOnClickListener {
            if (przycisk2.alpha.equals(0.5F)){
                przycisk2.alpha = 1F
            }
            else{
                przycisk2.alpha = 0.5F
            }
            Toast.makeText(baseContext, "krowa", Toast.LENGTH_SHORT).show()
        }
        przycisk3.setOnClickListener {
            if (przycisk3.alpha.equals(0.5F)){
                przycisk3.alpha = 1F
            }
            else{
                przycisk3.alpha = 0.5F
            }
            Toast.makeText(baseContext, "pies", Toast.LENGTH_SHORT).show()
        }
        przycisk4.setOnClickListener {
            if (przycisk4.alpha.equals(0.5F)){
                przycisk4.alpha = 1F
            }
            else{
                przycisk4.alpha = 0.5F
            }
            Toast.makeText(baseContext, "strus", Toast.LENGTH_SHORT).show()
        }
        przycisk5.setOnClickListener {
            if (przycisk5.alpha.equals(0.5F)){
                przycisk5.alpha = 1F
            }
            else{
                przycisk5.alpha = 0.5F
            }
            Toast.makeText(baseContext, "tygrys", Toast.LENGTH_SHORT).show()
        }
    }
}


