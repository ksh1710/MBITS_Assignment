package com.example.mbits_assignment

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mbits_assignment.models.Data
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DataViewModel(
    private val dao: DataDao
) : ViewModel() {
    val _state = MutableStateFlow(DataState())
    val state = _state.asStateFlow()

    init {
        insertDataToDatabase()
    }

    private fun insertDataToDatabase() {

        val note1 = Data(
            ttl = "Music",
            value_ttl = "Calm",
        )
        val note2 = Data(
            ttl = "Goal",
            value_ttl = "De-Stress",
        )
        val note3 = Data(
            ttl = "Factors",
            value_ttl = "Sleep Factors",
        )
        val note4 = Data(
            ttl = "Jet Lag",
            value_ttl = "Check Tips",
        )
        val note5 = Data(
            ttl = "Sleep Stories",
            value_ttl = "Moon Light",
        )

        viewModelScope.launch {
            dao.deleteAllData()
            withContext(Dispatchers.IO) {
                dao.upsertNote(note1)
                dao.upsertNote(note2)
                dao.upsertNote(note3)
                dao.upsertNote(note4)
                dao.upsertNote(note5)

                val data = dao.getData()
                _state.value = _state.value.copy(data = data)
            }
        }
        Log.d("idk", "onEvent${state.value} ")

    }
}
//
//            else -> {
//
//            }
//        }
//}
//
//}