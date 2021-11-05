package com.learning.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.text)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            textView.text = getString(R.string.button_clicked)
        }
        this.button = button
    }

    override fun onStart() {
        super.onStart()
        Log.d("HelloWorld", getString(R.string.greeting))
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        button.setOnClickListener(null)
        super.onDestroy()
    }
}