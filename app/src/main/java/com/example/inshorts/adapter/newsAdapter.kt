package com.example.inshorts.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.inshorts.R
import com.example.inshorts.data.model.model.ArticlesDTO

class newsAdapter(var newsData: ArrayList<ArticlesDTO>, var onItemClickListener: onItemClickListener) : RecyclerView.Adapter<newsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): newsViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.news_item_layout, parent, false)
        return newsViewHolder(view, onItemClickListener)
    }

    override fun onBindViewHolder(holder: newsViewHolder, position: Int) {
        var data= newsData.get(position)
        return holder.setData(data)
    }

    override fun getItemCount(): Int {
        return newsData.size
    }
}