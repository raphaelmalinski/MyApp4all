package com.example.myapp4all

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val changeBgColorButton: Button = findViewById(R.id.changeBgColorButton)
        changeBgColorButton.setOnClickListener {
            changeBgColor()
        }
    }

    private fun changeBgColor() {
        val timestamp = timeStamp().toString()
        val lastChar = timestamp.substring(timestamp.length-1)

        val colorChosed = when (lastChar.toInt()) {
            0 -> Color.WHITE
            1 -> Color.BLACK
            2 -> Color.BLUE
            3 -> Color.GREEN
            4 -> Color.parseColor("#FFCBDB") //pink
            5 -> Color.RED
            6 -> Color.parseColor("#993399") //purple
            7 -> Color.YELLOW
            8 -> Color.GRAY
            else -> Color.parseColor("#C8A2C8") //lillac
        }

        //Change the bg color
        val linearLayout: LinearLayout = findViewById(R.id.linearLayout)
        linearLayout.setBackgroundColor(colorChosed)
    }

    private fun timeStamp(): Long {
        val currentTime = System.currentTimeMillis();
        return currentTime
    }


}