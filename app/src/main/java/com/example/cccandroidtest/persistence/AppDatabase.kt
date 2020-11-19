package com.example.cccandroidtest.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cccandroidtest.models.Estimate
import com.example.cccandroidtest.models.Person

@Database(entities = [Estimate::class, Person::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    abstract fun estimateDao(): EstimateDao
    abstract fun personDao(): PersonDao

    companion object {

        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }
}