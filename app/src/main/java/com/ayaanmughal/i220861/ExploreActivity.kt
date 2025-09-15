package com.ayaanmughal.i220861

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ExploreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.explore)

        val home = findViewById<ImageButton>(R.id.imageButton18)

        home.setOnClickListener {
            startActivity(Intent(this, HomePageActivity::class.java))
        }
        val search : EditText = findViewById(R.id.searchBar)

        search.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

    }
}