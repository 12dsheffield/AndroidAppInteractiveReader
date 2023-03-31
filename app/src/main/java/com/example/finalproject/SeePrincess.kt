package com.example.finalproject


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class SeePrincess : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seeprincess)
        //Toast.makeText(getApplicationContext(),"Pond: + $pondWaterSmelly + FlyBreath: + $flyBreath",Toast.LENGTH_SHORT).show();
    }


    fun Continue(view: View) {
        if(pondWaterSmelly == true) {
            val intent = Intent(this, MuddyFrogEnd::class.java)
            startActivity(intent)
        }
        else {
            if (flyBreath == true) {
                val intent = Intent(this, FrogBreathEnd::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, PrinceEnd::class.java)
                startActivity(intent)
            }
        }
    }

    fun MainMenu (view: View) {
        val intent = Intent(this,MainMenu::class.java)
        startActivity(intent)
    }

}