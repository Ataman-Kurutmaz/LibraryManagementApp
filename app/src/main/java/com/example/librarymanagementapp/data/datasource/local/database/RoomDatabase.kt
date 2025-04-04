package com.example.librarymanagementapp.data.datasource.local.database


import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.librarymanagementapp.data.datasource.local.dao.HomeDAO
import com.example.librarymanagementapp.data.datasource.local.dao.ProfileDAO
import com.example.librarymanagementapp.data.datasource.local.entity.Book

@Database(entities = [Book::class], version = 1)
abstract class RoomDatabase : RoomDatabase() {
    abstract fun homeDao(): HomeDAO
    abstract fun profileDao(): ProfileDAO
}