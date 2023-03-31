package com.example.finalproject


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.core.content.ContextCompat.startActivity
import com.example.finalproject.databinding.ActivityMainBinding
public var pondWaterSmelly: Boolean = false
public var flyBreath: Boolean = false

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun mainMenu(view: View) {
        if(binding.username.text.isNotBlank() && binding.password.text.isNotBlank()) {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
    }
}
/*import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.finalproject.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loginButton.setOnClickListener{login()}
    }


    fun login() {
        if(binding.username.text.isNotBlank() && binding.password.text.isNotBlank()) {
            setContentView(R.layout.mainmenu)
            return
        }
    }
    fun intro(){
        setContentView(R.layout.intro)
        return
    }
}*/