package com.example.finalproject


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class DieHeron : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dieheron)
        Toast.makeText(getApplicationContext(),"Achievement Unlocked: Heron Food",Toast.LENGTH_SHORT).show();
    }


    fun Redo (view: View) {
        flyBreath = false
        pondWaterSmelly = false
        val intent = Intent(this,Intro::class.java)
        startActivity(intent)
    }
    fun MainMenu (view: View) {
        val intent = Intent(this,MainMenu::class.java)
        startActivity(intent)
    }

}