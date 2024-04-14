package com.example.mbits_assignment
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mbits_assignment.models.Data


@Database(
    entities = [Data::class],
    version = 1
)
abstract class DataDatabase: RoomDatabase(){
    abstract val dao: DataDao
}