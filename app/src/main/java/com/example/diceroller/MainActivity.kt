package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    /* Declare Dice Image Variables */

    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Lets Roll"

        /* Liston to Button Click Event */

        rollButton.setOnClickListener{
            rollDice()
        }

        /* Initialize dice Image Variables */

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)
    }

    /* Swap Dice Images when method is call */

    private fun rollDice() {
        diceImage1.setImageResource(pickDice())
        diceImage2.setImageResource(pickDice())
    }

    /* Pick Random dice Image */

    private fun pickDice(): Int {

        return when (Random.nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

    }
}
