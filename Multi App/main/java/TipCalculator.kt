package com.example.multiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.tip_calculator.*

class TipCalculator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tip_calculator)

        //Switch to Android 8.0

        val inputText = findViewById<EditText>(R.id.edit_text)

        val checkBox15 = findViewById<CheckBox>(R.id.checkBox1)

        val checkBox18 = findViewById<CheckBox>(R.id.checkBox2)

        val checkBox20 = findViewById<CheckBox>(R.id.checkBox3)

        val percentageView = findViewById<TextView>(R.id.tip_selected)

        val finalPrice = findViewById<TextView>(R.id.final_price)

        val calculate = findViewById<Button>(R.id.calculate_button)

        val backToRandom = findViewById<Button>(R.id.back_to_random)

        /*
        var justChecked1 = false
        var justChecked2 = false
        var justChecked3 = false
        if (checkBox1.isChecked) {
            if(justChecked1) {
                justChecked1 = true
                percentageView.setText("15%")
            }
        }
        else if (checkBox2.isChecked) {
            if(justChecked2) {
                justChecked2 = true
                percentageView.setText("18%")
            }
        }
        else if (checkBox3.isChecked) {
            if(justChecked3) {
                justChecked3 = true
                percentageView.setText("20%")
            }
        }
        */

        fun onCheckboxClicked() {
            if (checkBox1.isChecked) {
                percentageView.setText(checkBox1.text.toString())
            }
            else if (checkBox2.isChecked) {
                percentageView.setText(checkBox2.text.toString())
            }

            else if (checkBox3.isChecked) {
                percentageView.setText(checkBox3.text.toString())
            }
        }
        fun message(str: String) {
            Toast.makeText(this, str, Toast.LENGTH_LONG).show()
        }




        fun calculateTip() {
            val price = inputText.getText().toString().toDouble()
            val final_price1 = (price * 0.15)
            finalPrice.setText(final_price1.toString())
        }
        calculate.setOnClickListener { onCheckboxClicked() }
        backToRandom.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
