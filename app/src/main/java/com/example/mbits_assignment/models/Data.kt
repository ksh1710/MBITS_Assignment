package com.example.mbits_assignment.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Data(
    val ttl: String,
    val value_ttl: String,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
