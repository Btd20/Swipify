package com.example.swipify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.swipify.R.id.recyclerTendency
import com.example.swipify.adapter.TendencyAdapter

class MainActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT = 4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading_page)
        initRecyclerView()

        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.homelist)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TendencyAdapter(TendencyProvider.tendencyList)
    }
}