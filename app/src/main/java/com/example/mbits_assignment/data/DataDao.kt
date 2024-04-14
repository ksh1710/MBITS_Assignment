package com.example.mbits_assignment
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.mbits_assignment.models.Data


@Dao
interface DataDao {

    @Upsert
    suspend fun upsertNote(data: Data)

    @Query("SELECT * FROM data")
    fun getData(): List<Data>


    @Query("DELETE FROM Data")
    suspend fun deleteAllData()
}











