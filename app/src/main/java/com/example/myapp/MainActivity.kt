package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn_1)
        val btn2 = findViewById<Button>(R.id.btn_2)
        val btn3 = findViewById<Button>(R.id.btn_3)

        btn1.setOnClickListener {
            Log.e("CLICK", "Button 1 click")
        }
        btn2.setOnClickListener {
            Log.e("CLICK", "Button 2 click")
        }
        btn3.setOnClickListener {
            Log.e("CLICK", "Button 3 click")
        }
    }
}