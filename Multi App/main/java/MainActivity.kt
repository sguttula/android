package com.example.multiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Switch to Android 8.0

        val n1 = findViewById<EditText>(R.id.edit_text)

        val n2 = findViewById<EditText>(R.id.edit_text2)

        val textboxAnswer = findViewById<TextView>(R.id.text_result)

        val checkbox = findViewById<CheckBox>(R.id.checkBox1)

        val button1 = findViewById<Button>(R.id.number_button)

        val dieRollerButton = findViewById<Button>(R.id.die_roller_button)

        val exitAppButton = findViewById<Button>(R.id.exit_button)

        fun input1() {
            val randomNumber =
                (n1.getText().toString().toInt()..n2.getText().toString().toInt()).random()
            textboxAnswer.text = randomNumber.toString()
        }
        button1.setOnClickListener { input1() }

        dieRollerButton.setOnClickListener {
            val intent = Intent(this, DieRoller::class.java)
            startActivity(intent)
        }
        exitAppButton.setOnClickListener { finish() }
    }
}
