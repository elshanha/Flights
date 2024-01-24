package com.example.entities.model
import com.google.gson.annotations.SerializedName

data class Flights (

	@SerializedName("departure") val departure : List<Departure>
)