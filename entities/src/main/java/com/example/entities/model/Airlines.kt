package com.example.entities.model
import com.google.gson.annotations.SerializedName

data class Airlines (

	@SerializedName("code") val code : String,
	@SerializedName("name") val name : String,
	@SerializedName("slug") val slug : String,
	@SerializedName("image") val image : String
)