package com.example.mynewproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val singUp = findViewById<Button>(R.id.btnSignUp)
        singUp.setOnClickListener {
            startActivity(Intent(this@MainActivity,SignUpActivity::class.java))
        }

        val signIn = findViewById<TextView>(R.id.txtSignIn)
        signIn.setOnClickListener {
            startActivity(Intent(this@MainActivity,LoginNowActivity::class.java))
        }
    }
}