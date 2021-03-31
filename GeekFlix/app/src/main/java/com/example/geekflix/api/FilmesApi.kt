package com.example.geekflix.api


import com.example.geekflix.model.Filme
import com.example.geekflix.model.FilmesTask
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface FilmesApi {


    @GET("trending/movie/week")
    fun getAllList(@Query("api_key") api:String): Call<FilmesTask>

    @GET("movie/{id}")
    fun getAllListDetales(@Path("id") id: String, @Query("api_key") api:String): Call<Filme>

}


