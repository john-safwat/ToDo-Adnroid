package com.john.todoandroid.Splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.john.todoandroid.Home.HomeActivity
import com.john.todoandroid.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var splashBinding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // function ot initialize the viewBinding and the content of the screen
        initView()
    }

    private fun initView() {
        splashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashBinding.root);
        Handler(mainLooper).postDelayed({ goToHomeActivity() }, 2000)
    }

    private fun goToHomeActivity() {
        val intent = Intent(this  , HomeActivity::class.java)
        startActivity(intent)
        finish()
    }


}