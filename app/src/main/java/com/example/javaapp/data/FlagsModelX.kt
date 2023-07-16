package com.example.javaapp.data


import com.google.gson.annotations.SerializedName

data class FlagsModelX(
    @SerializedName("alt")
    val alt: String? = "",
    @SerializedName("png")
    val png: String? = "",
    @SerializedName("svg")
    val svg: String? = ""
)