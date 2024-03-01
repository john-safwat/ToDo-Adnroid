package com.john.todoandroid

import android.app.Application
import com.john.todoandroid.Database.TasksDatabase

class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        TasksDatabase.initDatabase(this)
    }
}