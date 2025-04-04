package com.example.librarymanagementapp.data.datasource.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.librarymanagementapp.data.datasource.local.entity.Book
import kotlinx.coroutines.flow.Flow

@Dao
interface HomeDAO {

    @Query("SELECT * FROM books")
    fun getAllBooks(): Flow<List<Book>>
}