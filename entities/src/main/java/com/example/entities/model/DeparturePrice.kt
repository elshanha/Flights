package com.example.entities.model
import com.google.gson.annotations.SerializedName

data class DeparturePrice (

	@SerializedName("min") val min : Int,
	@SerializedName("max") val max : Int
)