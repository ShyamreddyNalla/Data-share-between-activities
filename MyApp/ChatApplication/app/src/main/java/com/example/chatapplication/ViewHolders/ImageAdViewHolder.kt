package com.example.chatapplication.ViewHolders

import androidx.recyclerview.widget.RecyclerView
import com.example.chatapplication.databinding.ImageAdsBinding
import com.example.chatapplication.models.ImageAd
import com.squareup.picasso.Picasso

class ImageAdViewHolder(private val binding: ImageAdsBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(imageAd: ImageAd) {

       Picasso.get()
           .load(imageAd.imageUrl)
           .into(binding.imageAd)

    }
}