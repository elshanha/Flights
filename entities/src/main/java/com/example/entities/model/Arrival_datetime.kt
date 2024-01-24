package com.example.entities.model

import com.google.gson.annotations.SerializedName
data class Arrival_datetime (

	@SerializedName("date") val date : String,
	@SerializedName("time") val time : String,
	@SerializedName("timestamp") val timestamp : Int
)