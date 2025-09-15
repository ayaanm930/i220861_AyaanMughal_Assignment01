package com.ayaanmughal.i220861

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account)

        val switchAccounts = findViewById<TextView>(R.id.textView13)
        val signUp = findViewById<TextView>(R.id.textView15)
        val loginButton = findViewById<Button>(R.id.button3)

        switchAccounts.setOnClickListener {
            startActivity(Intent(this, SwitchAccountActivity::class.java))
        }

        signUp.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }

        loginButton.setOnClickListener {
            startActivity(Intent(this, HomePageActivity::class.java))
            finish()
        }
    }
}
