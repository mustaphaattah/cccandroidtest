package com.example.cccandroidtest.persistence

import com.example.cccandroidtest.models.Estimate

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

    fun getEstimateById(estimateId: Int): Estimate {
        return estimateDao.getEstimateById(estimateId)
    }
}