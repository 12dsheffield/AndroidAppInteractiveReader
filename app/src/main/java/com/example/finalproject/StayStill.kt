package com.example.finalproject


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class StayStill : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.staystill)
    }


    fun PoorDelores(view: View) {
        val intent = Intent(this, PoorDelores::class.java)
        startActivity(intent)
    }

    fun MainMenu (view: View) {
        val intent = Intent(this,MainMenu::class.java)
        startActivity(intent)
    }

}