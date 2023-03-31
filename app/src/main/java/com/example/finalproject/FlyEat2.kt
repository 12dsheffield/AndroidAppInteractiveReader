package com.example.finalproject


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class FlyEat2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flyeat2)
        flyBreath = true
    }


    fun SeePrincess(view: View) {
        val intent = Intent(this, SeePrincess::class.java)
        startActivity(intent)
    }

    fun MainMenu (view: View) {
        val intent = Intent(this,MainMenu::class.java)
        startActivity(intent)
    }

}