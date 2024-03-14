package com.example.swipify

import LoginActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.swipify.R.id.bottom_navigation
import com.example.swipify.R.id.recyclerTendency
import com.example.swipify.adapter.TendencyAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)
        initRecyclerView()

        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT.toLong())

        // Find the BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(bottom_navigation)

        // Set up a NavigationListener
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {

                    true
                }
                R.id.page_2 -> {
                    // Handle navigation to page 2
                    true
                }
                R.id.page_3 -> {
                    // Handle navigation to page 3
                    true
                }
                R.id.page_4 -> {
                    // Handle search functionality
                    true
                }
                else -> false
            }
        }
    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(recyclerTendency)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TendencyAdapter(TendencyProvider.tendencyList)
    }
}
