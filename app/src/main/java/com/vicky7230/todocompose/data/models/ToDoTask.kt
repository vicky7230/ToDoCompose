package com.vicky7230.todocompose.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.vicky7230.todocompose.util.Constants

@Entity(tableName = Constants.DATABASE_TABLE_TODO)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
