package com.example.example

import com.google.gson.annotations.SerializedName


data class Values (

  @SerializedName("id"   ) var id   : String? = null,
  @SerializedName("code" ) var code : String? = null,
  @SerializedName("ttl"  ) var ttl  : String? = null,
  @SerializedName("dsc"  ) var dsc  : String? = null,
  @SerializedName("url"  ) var url  : String? = null

)