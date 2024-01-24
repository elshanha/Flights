package com.example.entities.model
import com.google.gson.annotations.SerializedName

data class Airports (

	@SerializedName("id") val id : String,
	@SerializedName("slug") val slug : String,
	@SerializedName("airport_name") val airport_name : String,
	@SerializedName("city_code") val city_code : String,
	@SerializedName("city_name") val city_name : String,
	@SerializedName("city_slug") val city_slug : String,
	@SerializedName("country_code") val country_code : String,
	@SerializedName("country_name") val country_name : String
)