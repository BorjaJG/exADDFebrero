package com.example.exaddfebrero.core.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.exaddfebrero.feature.album.domain.Album
import com.example.exaddfebrero.feature.seta.data.local.SetaDao
import com.example.exaddfebrero.feature.seta.domain.Seta


@Database(entities = [Seta::class], [Album::class], version = 2, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun setaDao(): SetaDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "Coleccion_Setas"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}