package com.example.chogoyadenisseanimalsapp.models

import com.google.gson.annotations.SerializedName

data class Environment(
    @SerializedName("_id")
    val id: String,
    val name: String,
    val description: String,
    val image: String
)
