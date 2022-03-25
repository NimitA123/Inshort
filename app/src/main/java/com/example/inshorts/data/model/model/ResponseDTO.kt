package com.example.inshorts.data.model.model


import com.google.gson.annotations.SerializedName


data class ResponseDTO(

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("totalResults")
	val totalResults: Int? = null,

	@field:SerializedName("articles")
	val articles: List<ArticlesDTO?>? = null
)