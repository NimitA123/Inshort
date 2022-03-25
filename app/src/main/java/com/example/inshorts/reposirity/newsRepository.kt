package com.example.inshorts.reposirity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.inshorts.data.model.model.ResponseDTO
import com.example.inshorts.data.model.remoteDatabase.ApiService

class newsRepository(private val apiService: ApiService) {
  private var mutableLiveData = MutableLiveData<ResponseDTO>()
  val newsData:LiveData<ResponseDTO>
  get() = mutableLiveData
 suspend fun getLiveData(category:String){
     var response = apiService.getResponse("us", "737599f1a20f4a4e849678a9bf2dc178",
     category, 100)
     if(response.body()!= null){
       mutableLiveData.postValue(response.body())
     }
  }

}