package com.example.finalproject


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class CheckSky : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checksky)
    }


    fun StayStill(view: View) {
        val intent = Intent(this, StayStill::class.java)
        startActivity(intent)
    }
    fun PondRetreat (view: View) {
        pondWaterSmelly = true
        val intended = Intent(this, PondRetreat::class.java)
        startActivity(intended)
    }

    fun MainMenu (view: View) {
        val intentional = Intent(this, MainMenu::class.java)
        startActivity(intentional)
    }

}