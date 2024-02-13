package com.john.todoandroid.Splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.john.todoandroid.Home.HomeActivity
import com.john.todoandroid.databinding.AtivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var splashBinding: AtivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // function ot initialize the viewBinding and the content of the screen
        initView()
    }

    private fun initView() {
        splashBinding = AtivitySplashBinding.inflate(layoutInflater)
        setContentView(splashBinding.root);
        Handler(mainLooper).postDelayed({ goToHomeActivity() }, 2000)
    }

    private fun goToHomeActivity() {
        val intent = Intent(this  , HomeActivity::class.java)
        startActivity(intent)
        finish()
    }


}