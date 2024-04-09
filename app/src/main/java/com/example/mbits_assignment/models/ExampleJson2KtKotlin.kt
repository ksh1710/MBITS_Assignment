package com.example.example

import com.google.gson.annotations.SerializedName


data class ExampleJson2KtKotlin(

    @SerializedName("status") var status: Status? = Status(),
    @SerializedName("data") var data: Data? = Data()

)