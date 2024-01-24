package com.example.entities.model
import com.google.gson.annotations.SerializedName

data class Origins (

	@SerializedName("label") val label : String,
	@SerializedName("id") val id : String,
	@SerializedName("is_city") val is_city : Boolean,
	@SerializedName("city_name") val city_name : String,
	@SerializedName("slug") val slug : String,
	@SerializedName("airport_name") val airport_name : String,
	@SerializedName("country_name") val country_name : String,
	@SerializedName("country_code") val country_code : String
)