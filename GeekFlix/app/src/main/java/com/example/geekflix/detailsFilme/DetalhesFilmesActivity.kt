package com.example.geekflix.detailsFilme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geekflix.R
import com.example.geekflix.model.Filme

class DetalhesFilmesActivity : AppCompatActivity() {

    private var itemId: String? = ""

    companion object {
        const val id = "id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_filmes)
    }


    private fun getExtra() {
        if (intent.extras != null) {
            val filme = intent.getParcelableExtra("filme") as? Filme
            itemId = filme?.id_filme
        }

    }

}