package com.example.geekflix.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.geekflix.api.RestApi
import com.example.geekflix.model.FilmesTask
import retrofit2.Call
import retrofit2.Response

class MainViewModel : ViewModel(){
    private val filmesLiveData : MutableLiveData<FilmesTask> = MutableLiveData()

    fun callListFilme(): MutableLiveData<FilmesTask> {
        val call = RestApi.retrofitApi().getAllList("579dbbdd2de6dd3cc42c4d65dc3afdae")

        call.enqueue(object : retrofit2.Callback<FilmesTask> {
            override fun onResponse(call: Call<FilmesTask>, response: Response<FilmesTask>) {
                if(response.isSuccessful){
                    filmesLiveData.value = response.body()
                }
            }

            override fun onFailure(call: Call<FilmesTask>, t: Throwable) {
                t.printStackTrace()
            }

        })

        return filmesLiveData

    }


}