package com.example.example

import com.google.gson.annotations.SerializedName


data class Status (

  @SerializedName("code"  ) var code  : Int?     = null,
  @SerializedName("msg"   ) var msg   : String?  = null,
  @SerializedName("retry" ) var retry : Boolean? = null,
  @SerializedName("err"   ) var err   : String?  = null

)