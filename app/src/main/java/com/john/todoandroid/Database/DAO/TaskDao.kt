package com.john.todoandroid.Database.DAO

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.john.todoandroid.Database.Models.Task

@Dao
interface TaskDao {
    @Insert
    fun insertTask(task: Task)
    @Update
    fun updateTask(task: Task)
    @Delete
    fun deleteTask(task: Task)
    @Query("select * from Tasks")
    fun getAllTasks():List<Task>
    @Query("select * from Tasks where DateTime == :date")
    fun getTasksByDate(date:Long):List<Task>

}