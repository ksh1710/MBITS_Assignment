package com.example.example

import com.google.gson.annotations.SerializedName


data class ToolData (

  @SerializedName("id"   ) var id   : String?        = null,
  @SerializedName("uid"  ) var uid  : String?        = null,
  @SerializedName("type" ) var type : Int?           = null,
  @SerializedName("code" ) var code : String?        = null,
  @SerializedName("prc"  ) var prc  : ArrayList<Prc> = arrayListOf()

)