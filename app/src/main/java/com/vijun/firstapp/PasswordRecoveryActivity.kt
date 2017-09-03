package com.vijun.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar

class PasswordRecoveryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_recovery)

        val mToolbar: Toolbar = findViewById(R.id.pra_toolbar)
        mToolbar.title = "Password recovery"
        mToolbar.setTitleTextColor(-1)
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)
    }
}
