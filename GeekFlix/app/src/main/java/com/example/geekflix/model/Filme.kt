package com.example.geekflix.model


import com.google.gson.annotations.SerializedName


data class Filme(
    @SerializedName("original_name") var original_name: String?,
    @SerializedName("poster_path") var poster_path: String?,
    @SerializedName("original_title") var original_title: String?,
    @SerializedName("overview") var overview: String?,
    @SerializedName("id") var id_filme: String?,
    @SerializedName("release_date") var release_date: String?
)