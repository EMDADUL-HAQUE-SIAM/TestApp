package com.example.mynewproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val singUp = findViewById<Button>(R.id.btnSignUp)
        singUp.setOnClickListener {
            Toast.makeText(this, "Successfully signup", Toast.LENGTH_SHORT).show()

        }

        val signIn = findViewById<TextView>(R.id.txtSignIn)
        signIn.setOnClickListener {
            startActivity(Intent(this@SignUpActivity,LoginNowActivity::class.java))
        }
    }
}