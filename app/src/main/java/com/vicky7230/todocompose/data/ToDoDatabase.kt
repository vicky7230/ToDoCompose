package com.vicky7230.todocompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.vicky7230.todocompose.data.daos.ToDoDao
import com.vicky7230.todocompose.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun todoDao(): ToDoDao
}