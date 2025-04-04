package com.example.librarymanagementapp.di

import android.content.Context
import androidx.room.Room
import com.example.librarymanagementapp.data.datasource.local.database.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule{

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): RoomDatabase = Room.databaseBuilder(context,
            RoomDatabase::class.java,
            "room_database")
            .build()

    @Provides
    @Singleton
    fun provideHomeDao(romsDatabase: RoomDatabase) = romsDatabase.homeDao()

    @Provides
    @Singleton
    fun provideProfileDao(romsDatabase: RoomDatabase) = romsDatabase.profileDao()
}