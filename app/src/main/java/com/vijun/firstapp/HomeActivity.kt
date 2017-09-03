package com.vijun.firstapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val mToolbar = findViewById<Toolbar>(R.id.ha_toolbar)
        mToolbar.title = "Home"
        mToolbar.setTitleTextColor(-1)
    }
}
