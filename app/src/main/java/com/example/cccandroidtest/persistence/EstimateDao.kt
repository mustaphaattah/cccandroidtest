package com.example.cccandroidtest.persistence

import androidx.room.*
import com.example.cccandroidtest.models.Estimate
import com.example.cccandroidtest.models.Person
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first

@Dao
interface EstimateDao {

    @Insert
    suspend fun insert(estimate: Estimate)

    @Delete
    suspend fun delete(estimate: Estimate)

    @Update
    suspend fun update(estimate: Estimate)

    @Query("SELECT * FROM estimate_table WHERE id = :estimateId")
    fun getEstimateById(estimateId: Int): Flow<Estimate>

    @Transaction
    suspend fun linkPerson(estimateId: Int, person: Person) {
        val estimate = getEstimateById(estimateId).first()
        estimate.created_by = person
        estimate.requested_by = person
        estimate.contact = person
        update(estimate)
    }


}