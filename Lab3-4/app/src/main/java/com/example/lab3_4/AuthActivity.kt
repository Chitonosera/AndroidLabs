package com.example.lab3_4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.lab3_4.R

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        findViewById<Button>(R.id.btn_authorisation).setOnClickListener {
            val login = findViewById<EditText>(R.id.btn_login).text.toString()
            val password = findViewById<EditText>(R.id.btn_password).text.toString()

            val savedLogin = sharedPreferences.getString("login", "")
            val savedPassword = sharedPreferences.getString("password", "")

            if (login == savedLogin && password == savedPassword) {

                startActivity(Intent(this, MenuActivity::class.java))
                finish()
            } else {

                Toast.makeText(this, "Invalid login or password", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.btn_registration).setOnClickListener {
            startActivity(Intent(this,RegistrationActivity::class.java))
        }
    }
}