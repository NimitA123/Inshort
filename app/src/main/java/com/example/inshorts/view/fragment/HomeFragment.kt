package com.example.inshorts.view.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.inshorts.view.DetailsActivity
import com.example.inshorts.R
import com.example.inshorts.adapter.newsAdapter
import com.example.inshorts.data.model.model.ArticlesDTO
import com.example.inshorts.data.model.remoteDatabase.ApiService
import com.example.inshorts.data.model.remoteDatabase.Network
import com.example.inshorts.adapter.onItemClickListener
import com.example.inshorts.reposirity.newsRepository
import com.example.inshorts.viewModel.MainNewsViewModel
import com.example.inshorts.viewModel.newsViewModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), onItemClickListener {
     private lateinit var newsViewModel1:newsViewModel
     private var newsData = arrayListOf<ArticlesDTO>()
    private lateinit var newsAdapter1: newsAdapter
    private lateinit var onItemClickListener: onItemClickListener
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val apiService = Network.getRetrofit().create(ApiService::class.java)
        var repository = newsRepository(apiService)
        newsViewModel1 = ViewModelProvider(this, MainNewsViewModel(repository)).get(newsViewModel::class.java)
        newsViewModel1.getCategory("general")
        newsViewModel1.newsData.observe(viewLifecycleOwner , Observer{
            newsData.addAll(it.articles as ArrayList<ArticlesDTO>)
            setAdapter()
        })

    }

    private fun setAdapter() {
        newsAdapter1 = newsAdapter(newsData, this)
        var linearLayout = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerviewofhome.adapter = newsAdapter1
        recyclerviewofhome.layoutManager = linearLayout
    }

    override fun OnItemclick(image: String, contain: String) {
        var intent = Intent(context, DetailsActivity::class.java)
        intent.putExtra("image", image)
        intent.putExtra("contain", contain)
        startActivity(intent)
    }


}
