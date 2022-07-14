package com.example.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

lateinit var operation : String
class DisplayResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_result)
        val result = intent.getStringExtra(operation)
        val calculation = findViewById<TextView>(R.id.textViewResult).apply {
            text = result
        }
    }


}