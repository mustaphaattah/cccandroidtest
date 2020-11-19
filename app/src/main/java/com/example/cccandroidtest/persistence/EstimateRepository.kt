package com.example.cccandroidtest.persistence

import com.example.cccandroidtest.models.Estimate
import com.example.cccandroidtest.models.Person
import kotlinx.coroutines.flow.Flow

class EstimateRepository (private val estimateDao: EstimateDao) {

    suspend fun insert(estimate: Estimate) {
        estimateDao.insert(estimate)
    }

    suspend fun delete(estimate: Estimate) {
        estimateDao.delete(estimate)
    }

    suspend fun update(estimate: Estimate) {
        estimateDao.update(estimate)
    }

    fun getEstimateById(estimateId: Int): Flow<Estimate> {
        return estimateDao.getEstimateById(estimateId)
    }

    suspend fun linkPerson(estimateId: Int, person: Person) {
        estimateDao.linkPerson(estimateId, person)
    }
}