package com.example.chatapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.chatapplication.ViewHolders.ImageAdViewHolder
import com.example.chatapplication.ViewHolders.NewsImageViewHolder
import com.example.chatapplication.ViewHolders.NewsTextViewHolder
import com.example.chatapplication.databinding.ImageAdsBinding
import com.example.chatapplication.databinding.NewsTextDescripitionBinding
import com.example.chatapplication.databinding.NewsWithImageBinding
import com.example.chatapplication.models.ImageAd
import com.example.chatapplication.models.NewsImage
import com.example.chatapplication.models.NewsText

class NewsAdapter(val newsList: List<Any>) : Adapter<ViewHolder>() {

    companion object {
        const val VIEW_TYPE_NEWS_TEXT = 10
        const val VIEW_TYPE_NEWS_IMAGE = 20
        const val VIEW_TYPE_IMAGE_AD = 30
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        if (viewType == VIEW_TYPE_NEWS_TEXT) {
            val binding = NewsTextDescripitionBinding.inflate(inflater, parent, false)
            return NewsTextViewHolder(binding)
        } else if (viewType == VIEW_TYPE_NEWS_IMAGE) {
            val binding = NewsWithImageBinding.inflate(inflater, parent, false)
            return NewsImageViewHolder(binding)
        } else if (viewType == VIEW_TYPE_IMAGE_AD) {
            val binding = ImageAdsBinding.inflate(inflater, parent, false)
            return ImageAdViewHolder(binding)
        }

        throw RuntimeException("Invalid view type")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (holder is NewsTextViewHolder) {
            holder.bind(newsList[position] as NewsText)
        } else if (holder is NewsImageViewHolder) {
            holder.bind(newsList[position] as NewsImage)
        } else if (holder is ImageAdViewHolder) {
            holder.bind(newsList[position] as ImageAd)
        }
    }

    override fun getItemCount(): Int = newsList.size

    override fun getItemViewType(position: Int): Int {
        if (newsList[position] is NewsText) {
            return VIEW_TYPE_NEWS_TEXT
        } else if (newsList[position] is NewsImage) {
            return VIEW_TYPE_NEWS_IMAGE
        } else if (newsList[position] is ImageAd) {
            return VIEW_TYPE_IMAGE_AD
        }
        return super.getItemViewType(position)
    }
}

