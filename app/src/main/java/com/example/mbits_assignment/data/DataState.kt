package com.example.mbits_assignment

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.mbits_assignment.models.Data

data class DataState(

    val data: List<Data> = listOf(Data("sum","sum dum")),
    val ttl: MutableState<String> = mutableStateOf(""),
    val value_ttl: MutableState<String> = mutableStateOf("")

)