package com.vijun.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val mToolbar: Toolbar = findViewById(R.id.sua_toolbar)
        mToolbar.title = "Create Account"
        mToolbar.setTitleTextColor(-1)
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)
    }
}
