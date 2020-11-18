package com.example.cccandroidtest.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person_table")
data class Person (
    // thought i'd make the primary key autogenerate by default
    @PrimaryKey(autoGenerate = true) var id: Int,
    var first_name: String,
    var last_name: String,
    var email: String,
    var phone_number: String
)