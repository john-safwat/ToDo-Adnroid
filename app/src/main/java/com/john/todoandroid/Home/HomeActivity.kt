package com.john.todoandroid.Home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.john.todoandroid.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity(){
    lateinit var homeBinding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        homeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(homeBinding.root)
    }
}