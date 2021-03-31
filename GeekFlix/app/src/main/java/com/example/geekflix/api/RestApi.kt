package com.example.geekflix.api

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

class RestApi {
    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"

        private fun FilmesProvider(): Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        fun retrofitApi(): FilmesApi = FilmesProvider().create(FilmesApi::class.java)


    }
}

