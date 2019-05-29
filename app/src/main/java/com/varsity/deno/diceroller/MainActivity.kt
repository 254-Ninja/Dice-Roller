package com.varsity.deno.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"

        rollButton.setOnClickListener {
            rollButton.setOnClickListener {
                rollDice()
            }

        }
    }

    private fun rollDice() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        val randomInt = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = randomInt.toString()

    }
}

