package com.example.inshorts.data.model.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class SourceDTO(

	@field:SerializedName("id")
	val id: Any? = null,

	@field:SerializedName("name")
	val name: String? = null
)

