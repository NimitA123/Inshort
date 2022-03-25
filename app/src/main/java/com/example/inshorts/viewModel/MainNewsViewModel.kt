package com.example.inshorts.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.inshorts.reposirity.newsRepository

class MainNewsViewModel(private var repository: newsRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return newsViewModel(repository) as T
    }
}