package com.example.cccandroidtest.persistence

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.example.cccandroidtest.models.Person

@Dao
interface PersonDao {

    @Insert
    suspend fun insert(person: Person)

    @Delete
    suspend fun delete(person: Person)


}