package com.example.example

import com.google.gson.annotations.SerializedName


data class ProgressData(

    @SerializedName("id") var id: String? = null,
    @SerializedName("uid") var uid: String? = null,
    @SerializedName("date") var date: Int? = null,
    @SerializedName("tgt") var tgt: Int? = null,
    @SerializedName("ach") var ach: Int? = null,
    @SerializedName("rcm") var rcm: Int? = null

)