package com.example.inshorts.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.inshorts.data.model.model.ResponseDTO
import com.example.inshorts.reposirity.newsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class newsViewModel(private val repository: newsRepository) : ViewModel() {
     fun getCategory(category:String){
        viewModelScope.launch(Dispatchers.IO) {
            repository.getLiveData(category)
        }

    }
     val newsData:LiveData<ResponseDTO>
     get() = repository.newsData

}