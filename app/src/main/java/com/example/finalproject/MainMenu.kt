package com.example.finalproject


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainmenu)
        pondWaterSmelly = false
        flyBreath = false
    }

    fun intro (view: View) {
        val intent = Intent(this,Intro::class.java)
        startActivity(intent)
    }
}