package com.example.cccandroidtest.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "estimate_table")
data class Estimate(
    // thought i'd make the primary key autogenerate by default
    @PrimaryKey(autoGenerate = true) val id: Int,
    val company: String,
    val address: String,
    val number: Int,
    val revision_number: Int,
    val created_date: String,
    @Embedded var created_by: Person?,
    @Embedded var requested_by: Person?,
    @Embedded var contact: Person?
)
