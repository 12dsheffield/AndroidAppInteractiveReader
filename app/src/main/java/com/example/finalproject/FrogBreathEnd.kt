package com.example.finalproject


import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class FrogBreathEnd : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frogbreathend)
        Toast.makeText(getApplicationContext(),"Achievement Unlocked: Frog Breath", Toast.LENGTH_SHORT).show();
    }


    fun MainMenu (view: View) {
        val intent = Intent(this,MainMenu::class.java)
        startActivity(intent)
    }

}