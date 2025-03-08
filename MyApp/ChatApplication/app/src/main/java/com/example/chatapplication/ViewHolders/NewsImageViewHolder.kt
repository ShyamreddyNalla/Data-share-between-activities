package com.example.chatapplication.ViewHolders

import androidx.recyclerview.widget.RecyclerView
import com.example.chatapplication.databinding.NewsWithImageBinding
import com.example.chatapplication.models.NewsImage
import com.squareup.picasso.Picasso

class NewsImageViewHolder (private val binding: NewsWithImageBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(newsImage: NewsImage){
        binding.newsTitleWithImage.text = newsImage.title

        Picasso.get()
            .load(newsImage.imageUrl)
            .into(binding.newsImageTrump)



    }
}