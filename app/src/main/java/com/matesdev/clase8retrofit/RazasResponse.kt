package com.matesdev.clase8retrofit

import com.google.gson.annotations.SerializedName

data class RazasResponse (
    @SerializedName("message") val imagenes: List<String>,
    val status: String
)
