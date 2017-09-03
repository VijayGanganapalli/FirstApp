package com.vijun.firstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val mToolbar: Toolbar = findViewById(R.id.la_toolbar)
        mToolbar.title = "Welcome to application"
        mToolbar.setTitleTextColor(-1)

        la_btn_signIn.setOnClickListener {
            startActivity(Intent(applicationContext, HomeActivity::class.java))
        }
        la_btn_SignUp.setOnClickListener {
            startActivity(Intent(applicationContext, SignUpActivity::class.java))
        }
        la_tv_forgot_password.setOnClickListener {
            startActivity(Intent(applicationContext, PasswordRecoveryActivity::class.java))
        }
    }
}
