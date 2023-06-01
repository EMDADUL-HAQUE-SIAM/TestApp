package com.example.mynewproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginNowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_now)
        val singUp = findViewById<Button>(R.id.btnLogIn)
        singUp.setOnClickListener {
            Toast.makeText(this, "Successfully login", Toast.LENGTH_SHORT).show()

        }

        val signIn = findViewById<TextView>(R.id.signup_btn)
        signIn.setOnClickListener {
            startActivity(Intent(this@LoginNowActivity,SignUpActivity::class.java))
        }

    }
}