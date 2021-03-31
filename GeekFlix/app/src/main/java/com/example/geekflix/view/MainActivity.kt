package com.example.geekflix.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.geekflix.FilmesClickListner
import com.example.geekflix.R
import com.example.geekflix.api.*
import com.example.geekflix.model.Filme
import com.example.geekflix.model.FilmesTask
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.layout_tela_inicial.*


class MainActivity : AppCompatActivity(), FilmesClickListner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel: MainViewModel by viewModels()
        viewModel.callListFilme().observe(this, Observer {
            setAdapeter(it)
        }
        )
    }


    private fun setAdapeter(filmesTask: FilmesTask?) {
        recyclerList.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerList.adapter = filmesTask?.let { ListFilmesAdapter(it.returnList,this) }
    }

    override fun ClickFilmes(filme: Filme) {
        TODO("Not yet implemented")
    }


}
