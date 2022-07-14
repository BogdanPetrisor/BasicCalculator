package com.example.basiccalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
const val ADD = "Add"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add(view: View){
        val firstNumber = findViewById<TextView>(R.id.textNumber1).text.toString().toInt()
        val secondNumber = findViewById<TextView>(R.id.textNumber2).text.toString().toInt()
        val result = (firstNumber + secondNumber).toString()
        val intent = Intent(this,DisplayResultActivity::class.java).apply {
            putExtra(ADD,result)
            operation = ADD
        }
        startActivity(intent)
    }

}