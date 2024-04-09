package com.example.example

import com.google.gson.annotations.SerializedName


data class Data(

    @SerializedName("toolData") var toolData: ToolData? = ToolData(),
    @SerializedName("progressData") var progressData: ProgressData? = ProgressData()

)