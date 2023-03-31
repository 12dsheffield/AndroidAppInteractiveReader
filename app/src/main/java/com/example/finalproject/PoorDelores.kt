package com.example.finalproject


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class PoorDelores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.poordelores)
        Toast.makeText(getApplicationContext(),"Achievement Unlocked: Poor Delores", Toast.LENGTH_SHORT).show();
    }


    fun LookCastle2(view: View) {
        val intent = Intent(this, LookCastle2::class.java)
        startActivity(intent)
    }
    fun FlyEat2 (view: View) {
        val intent = Intent(this,FlyEat2::class.java)
        startActivity(intent)
    }

    fun MainMenu (view: View) {
        val intent = Intent(this,MainMenu::class.java)
        startActivity(intent)
    }

}