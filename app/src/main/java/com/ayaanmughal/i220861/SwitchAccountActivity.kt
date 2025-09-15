package com.ayaanmughal.i220861

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SwitchAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.switchaccount)

        val login = findViewById<Button>(R.id.button3) //login
        val signup = findViewById<TextView>(R.id.textView15) //signup
        val back = findViewById<Button>(R.id.button) //back

        login.setOnClickListener {
            startActivity(Intent(this, HomePageActivity::class.java))
        }

        signup.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }

        back.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }




    }
}
