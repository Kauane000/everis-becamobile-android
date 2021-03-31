package com.example.geekflix.api


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface FilmesApi {


    @GET("trending/movie/week")
    fun getAllList(@Query("api_key") api:String): Call<>

    @GET("movie/{id}")
    fun getAllListDetales(@Path("id") id: String, @Query("api_key") api:String): Call<>

}


