package com.example.lab3_4

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3_4.R

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        findViewById<Button>(R.id.btn_logout).setOnClickListener {

            val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.clear()
            editor.apply()


            val intent = Intent(this, AuthActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()

        }
    }
}
