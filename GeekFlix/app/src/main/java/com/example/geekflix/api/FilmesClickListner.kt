package com.example.geekflix.api

import com.example.geekflix.model.Filme

interface FilmesClickListner {
    fun ClickFilmes(filme : Filme)
}