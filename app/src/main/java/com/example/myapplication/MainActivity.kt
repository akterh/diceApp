package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var  imgOne :ImageView
    lateinit var  imgTwo :ImageView
    lateinit var  imgThree :ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgOne = findViewById(R.id.imageView)
        imgTwo= findViewById(R.id.imageView2)
        imgThree = findViewById(R.id.imageView3)

        val roll : Button = findViewById(R.id.btn_roll)
        roll.setOnClickListener {
            rolledDice1()
            rolledDice2()
            rolledDice3()
        }



    }

    private fun rolledDice1() {
        val rolledNum = (1..6).random()
        val rollView = when(rolledNum){
            1-> R.drawable.dice1
            2-> R.drawable.dice2
            3-> R.drawable.dice3
            4-> R.drawable.dice4
            5-> R.drawable.dice5
            6-> R.drawable.dice6
            else-> R.drawable.dice_empty
        }
        imgOne.setImageResource(rollView)

    }

    private fun rolledDice2() {
        val rolledNum = (1..6).random()
        val rollView = when(rolledNum){
            1-> R.drawable.dice1
            2-> R.drawable.dice2
            3-> R.drawable.dice3
            4-> R.drawable.dice4
            5-> R.drawable.dice5
            6-> R.drawable.dice6
            else-> R.drawable.dice_empty
        }
        imgTwo.setImageResource(rollView)

    }

    private fun rolledDice3() {
        val rolledNum = (1..6).random()
        val rollView = when(rolledNum){
            1-> R.drawable.dice1
            2-> R.drawable.dice2
            3-> R.drawable.dice3
            4-> R.drawable.dice4
            5-> R.drawable.dice5
            6-> R.drawable.dice6
            else-> R.drawable.dice_empty
        }
        imgThree.setImageResource(rollView)

    }
}