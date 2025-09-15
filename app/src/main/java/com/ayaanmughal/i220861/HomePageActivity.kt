package com.ayaanmughal.i220861

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        val explore = findViewById<ImageButton>(R.id.imageButton19)
        val newpost = findViewById<ImageButton>(R.id.imageButton21)

        explore.setOnClickListener {
            startActivity(Intent(this, ExploreActivity::class.java))
        }


    }
}
