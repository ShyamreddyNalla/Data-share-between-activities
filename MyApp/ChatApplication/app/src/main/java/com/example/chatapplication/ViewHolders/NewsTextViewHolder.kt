package com.example.chatapplication.ViewHolders

import androidx.recyclerview.widget.RecyclerView
import com.example.chatapplication.databinding.NewsTextDescripitionBinding
import com.example.chatapplication.models.NewsText

class NewsTextViewHolder(private val binding: NewsTextDescripitionBinding): RecyclerView.ViewHolder(binding.root) {
fun bind(newsText: NewsText) {
    binding.newsTitle.text = newsText.title
    binding.newsDescripiton.text = newsText.description


}
}