package com.example.geekflix.detailsFilme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.example.geekflix.R
import com.example.geekflix.api.RestApi
import com.example.geekflix.model.Filme
import kotlinx.android.synthetic.main.activity_detalhes_filmes.*
import retrofit2.Call
import retrofit2.Response

class DetalhesFilmesActivity : AppCompatActivity() {

    private var itemId: String? = ""

    companion object {
        const val id = "id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_filmes)

        getExtra()
        bindViews()
    }


    private fun getExtra() {
        if (intent.extras != null) {
            val filme = intent.getParcelableExtra("filme") as? Filme
            itemId = filme?.id_filme
        }

    }

    private fun bindViews() {
        val call = RestApi.retrofitApi()
            .getAllListDetales(itemId.toString(), "579dbbdd2de6dd3cc42c4d65dc3afdae")
        call.enqueue(object : retrofit2.Callback<Filme> {
            override fun onResponse(call: Call<Filme>, response: Response<Filme>) {
                if (response.isSuccessful) {
                    imagem_filme_detalhes.load(
                        "https://image.tmdb.org/t/p/w500" + response.body()?.poster_path
                    ) {
                        placeholder(R.drawable.ic_launcher_background)
                        fallback(R.drawable.ic_launcher_background)
                    }
                    detalhes.text = response.body()?.original_title
                }
            }

            override fun onFailure(call: Call<Filme>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }


}

