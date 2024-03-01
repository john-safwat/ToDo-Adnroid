package com.john.todoandroid.Database.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("Tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "DateTime")
    var date: Long,
    @ColumnInfo
    var title: String,
    @ColumnInfo
    var description: String,
    @ColumnInfo
    var isDone: Boolean,
)