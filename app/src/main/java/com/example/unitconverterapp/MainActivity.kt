package com.example.unitconverterapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var text: TextView
    private lateinit var button: Button
    lateinit var plus: Button
    private lateinit var muns: Button
    private var counter:Int=0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        text = findViewById(R.id.text2)
        button = findViewById(R.id.button)
        plus = findViewById(R.id.button2)
        muns = findViewById(R.id.button3)
        text.text = "$counter"
        button.setOnClickListener {
            counter=0
            text.text = "$counter"
        }
        plus.setOnClickListener {
            counter++
            text.text = "$counter"
        }
       muns.setOnClickListener {
            counter--
            text.text = "$counter"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
