package com.example.geekflix.model


import com.google.gson.annotations.SerializedName

data class FilmesTask(
    @SerializedName("results")
    var returnList: List<Filme>
)