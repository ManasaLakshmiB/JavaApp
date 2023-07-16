package com.example.javaapp.data


import com.google.gson.annotations.SerializedName

data class flagsmodelItemModel(
    @SerializedName("flags")
    val flags: FlagsModelX? = FlagsModelX()
)