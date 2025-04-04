package com.example.librarymanagementapp.data.datasource.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class Book(
    @PrimaryKey(autoGenerate = true) private val id: Int = 0,
    var title: String,
    var author: String,
    var description: String,
    var isAvailable: Boolean = false,
    var image: String
)