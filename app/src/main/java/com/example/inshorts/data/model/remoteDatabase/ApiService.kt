package com.example.inshorts.data.model.remoteDatabase

import com.example.inshorts.data.model.model.ResponseDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines")
   suspend fun getResponse(@Query("country") country:String,
    @Query("apiKey") apiKey:String,
    @Query("category") category:String,
    @Query("pageSize") pageSize:Int): Response<ResponseDTO>
}