package com.example.cccandroidtest.persistence

import androidx.room.*
import com.example.cccandroidtest.models.Estimate

@Dao
interface EstimateDao {

    @Insert
    suspend fun insert(estimate: Estimate)

    @Delete
    suspend fun delete(estimate: Estimate)

    @Update
    suspend fun update(estimate: Estimate)

    @Query("SELECT * FROM estimate_table WHERE id = :estimateId")
    fun getEstimateById(estimateId: Int): Estimate




}