package com.vicky7230.todocompose.di

import android.content.Context
import androidx.room.Room
import com.vicky7230.todocompose.data.ToDoDatabase
import com.vicky7230.todocompose.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context,
        ToDoDatabase::class.java,
        Constants.DATABASE_TABLE_TODO
    ).build()

    @Singleton
    @Provides
    fun provideDao(database: ToDoDatabase) = database.todoDao()
}