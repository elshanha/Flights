package com.example.entities.model
import com.google.gson.annotations.SerializedName

data class Departure (

	@SerializedName("previous_day_price") val previous_day_price : Int,
	@SerializedName("next_day_price") val next_day_price : Int
)