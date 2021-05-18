package com.deevvdd.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.button.MaterialButton
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var ivDice: ImageView
    private lateinit var btnRollDice: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRollDice = findViewById<MaterialButton>(R.id.btnRoll)
        ivDice = findViewById(R.id.ivDice)
        btnRollDice.text = getString(R.string.text_let_roll)
        btnRollDice.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resDice = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        ivDice.setImageResource(resDice)
    }
}