package com.example.example

import com.google.gson.annotations.SerializedName


data class Prc (

  @SerializedName("ttl"        ) var ttl        : String?           = null,
  @SerializedName("dsc"        ) var dsc        : String?           = null,
  @SerializedName("values"     ) var values     : ArrayList<Values> = arrayListOf(),
  @SerializedName("isMultiSel" ) var isMultiSel : Boolean?          = null,
  @SerializedName("type"       ) var type       : Int?              = null,
  @SerializedName("code"       ) var code       : String?           = null

)