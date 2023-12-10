package com.example.swipify

import android.widget.Toast
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
    }

    fun register(view: View) {
        setContentView(R.layout.register)
    }

    fun login(view: View) {
        setContentView((R.layout.main_page))
    }
}
