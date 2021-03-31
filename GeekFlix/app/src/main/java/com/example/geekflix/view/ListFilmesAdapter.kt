package com.example.geekflix.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.geekflix.R
import com.example.geekflix.model.Filme


class ListFilmesAdapter(private val list: List<Filme>, private val listener: MainActivity) :
    RecyclerView.Adapter<ListFilmesAdapter.ListFilmesAdapterViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListFilmesAdapterViewHolder {
        val View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_filme, parent, false)
        return ListFilmesAdapterViewHolder(View, list as MutableList<Filme>, )
    }

    override fun onBindViewHolder(holder: ListFilmesAdapterViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class ListFilmesAdapterViewHolder(
        itemView: View,
        var list: MutableList<Filme>,
    ) : RecyclerView.ViewHolder(itemView) {
        private val listTitle: AppCompatTextView = itemView.findViewById(R.id.titulo_filme)
        private val imagem: AppCompatImageView = itemView.findViewById(R.id.imagem_filme)
        private val card: CardView = itemView.findViewById(R.id.cardImagem)


        fun bind(filme: Filme) {


        }


    }


}


