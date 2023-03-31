package com.example.finalproject


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class Intro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro)
    }


    fun FlyEat1(view: View) {
        val intent = Intent(this, FlyEat1::class.java)
        startActivity(intent)
    }
    fun CheckSky (view: View) {
        val intent = Intent(this,CheckSky::class.java)
        startActivity(intent)
    }
    fun LookCastle1 (view: View) {
        val intent = Intent(this,LookCastle1::class.java)
        startActivity(intent)
    }
    fun MainMenu (view: View) {
        val intent = Intent(this,MainMenu::class.java)
        startActivity(intent)
    }

}