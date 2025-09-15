package com.ayaanmughal.i220861

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search)

        val search : EditText = findViewById(R.id.searchBar)

        search.setOnClickListener {
            startActivity(Intent(this, ExploreActivity::class.java))
        }

    }
}