package com.example.chatapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chatapplication.databinding.ActivityMainBinding
import com.example.chatapplication.models.ImageAd
import com.example.chatapplication.models.NewsImage
import com.example.chatapplication.models.NewsText

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val newsTextList = listOf(
            NewsText("Sports News", " India beat Australia by 5 wickets, Rcb won IPL 2025 by beating csk by 1 run in superover."),
            NewsText( "Poltics News", "Trump tariffics to raise grociers prices to noral house hold family , cant servive in usa ."),

        )
        val newsImageList = listOf(
            NewsImage("USA Trending", "https://s7d2.scene7.com/is/image/TWCNews/trump_AP_25036021236042_NAT_0205?wid=1250&hei=703&wide-bg\$"),
            NewsImage("NFL Trending", "https://tse4.mm.bing.net/th?id=OIP.7ad_MP3xJOwqnP_xwFcHbwHaEK&pid=Api&P=0&h=220")

        )

        val adList = listOf(
            ImageAd("https://tse3.mm.bing.net/th?id=OIP.BOhHMyfXhw0MLK5v713CXQHaJW&pid=Api&P=0&h=220"),
            ImageAd("https://tse1.mm.bing.net/th?id=OIF.Csmfrr37TqP80fCUnrquSw&pid=Api&P=0&h=220")
        )

        val combinedList = mutableListOf<Any>()
        combinedList.addAll(newsTextList)
        combinedList.addAll(newsImageList)
        combinedList.addAll(adList)


        val adapter = NewsAdapter(combinedList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }
}

