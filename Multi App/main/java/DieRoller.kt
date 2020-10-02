package com.example.multiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class DieRoller : AppCompatActivity() {

    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.die_roller)

        //Switch to Android 8.0

        val textboxAnswer = findViewById<TextView>(R.id.text_result)

        val dieRoller = findViewById<Button>(R.id.die_roller_button_roll)

        val tipCalculator = findViewById<Button>(R.id.tip_calculator_button)

        val randomNumberGenerator = findViewById<Button>(R.id.random_number_generator_button)

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)

        fun rollTheDice() {
            val randomInt1 = Random().nextInt(6) + 1
            val drawableResource1 = when (randomInt1) {
                1 -> R.drawable.one
                2 -> R.drawable.two
                3 -> R.drawable.three
                4 -> R.drawable.four
                5 -> R.drawable.five
                else -> R.drawable.six
            }

            diceImage1.setImageResource(drawableResource1)

            val randomInt2 = Random().nextInt(6) + 1
            val drawableResource2 = when (randomInt2) {
                1 -> R.drawable.one
                2 -> R.drawable.two
                3 -> R.drawable.three
                4 -> R.drawable.four
                5 -> R.drawable.five
                else -> R.drawable.six
            }

            diceImage2.setImageResource(drawableResource2)
        }
        dieRoller.setOnClickListener { rollTheDice() }
        tipCalculator.setOnClickListener {
            val intent = Intent(this, TipCalculator::class.java)
            startActivity(intent)
        }
        randomNumberGenerator.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
