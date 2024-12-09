package com.example.sunnyshine

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val btnMain: Button = findViewById(R.id.btnMain)
        val btnExit: Button = findViewById(R.id.btnExit)
        val textInfo: TextView = findViewById(R.id.textInfo)

        // Display your name and student number on the splash screen
        textInfo.text = "App Name: SUNNYSHINE\nName: Your Name\nStudent Number: ST10440433"

        btnMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnExit.setOnClickListener {
            finish()
        }
    }
}
