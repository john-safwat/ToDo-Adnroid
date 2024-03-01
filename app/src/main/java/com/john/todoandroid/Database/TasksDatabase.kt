package com.john.todoandroid.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.john.todoandroid.Database.DAO.TaskDao
import com.john.todoandroid.Database.Models.Task
import com.john.todoandroid.MyApplication

@Database(entities = [Task::class], version = 1, exportSchema = true)
abstract class TasksDatabase : RoomDatabase() {

    abstract fun getTasksDao(): TaskDao

    companion object {

        private var dataBase: TasksDatabase? = null

        fun initDatabase(application: MyApplication){
            Room.databaseBuilder(
                application.applicationContext,
                TasksDatabase::class.java, "ToDo_Database"
            ).fallbackToDestructiveMigration().allowMainThreadQueries().build()
        }
        fun getInstance(): TasksDatabase {
            return dataBase!!
        }

    }

}