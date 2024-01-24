package com.example.entities.model
import com.google.gson.annotations.SerializedName

data class Duration (

	@SerializedName("day") val day : Int,
	@SerializedName("hour") val hour : Int,
	@SerializedName("minute") val minute : Int,
	@SerializedName("total_minutes") val total_minutes : Int
)