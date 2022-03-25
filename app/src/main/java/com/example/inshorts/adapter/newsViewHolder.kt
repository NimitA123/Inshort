package com.example.inshorts.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.inshorts.R
import com.example.inshorts.data.model.model.ArticlesDTO
import com.example.inshorts.data.model.model.ResponseDTO
import com.example.inshorts.onItemClickListener
import kotlinx.android.synthetic.main.news_item_layout.view.*

class newsViewHolder(itemView: View,var  onItemClickListener: onItemClickListener) : RecyclerView.ViewHolder(itemView) {
    fun setData(data: ArticlesDTO) {
        itemView.mainheading.text = data.title.toString()
        if(data.description.toString()!= null) {
            itemView.contain.text = data.description.toString()
        }
        else{
            itemView.contain.text = "\"It's a day of high-level meetings, with an extraordinary " +
                    "NATO summit taking place in Brussels, as well" +
                    " as meetings of EU leaders and the G-7.\""
        }

        Glide.with(itemView.context).load(data.urlToImage).placeholder(R.drawable.img).into(itemView.image)
        if(data.author.toString()!= null) {
            itemView.author.text = data.author.toString()
        }
        else{
            itemView.author.text = "Amanda Macias, Holly Ellyatt, Christina Wilkie"
        }
        itemView.time.text = data.publishedAt.toString()
        itemView.cardView.setOnClickListener {
            onItemClickListener.OnItemclick(data.urlToImage.toString(), data.content.toString())
        }
    }
}