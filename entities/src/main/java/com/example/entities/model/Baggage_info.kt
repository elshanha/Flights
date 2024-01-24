package com.example.entities.model
import com.google.gson.annotations.SerializedName

data class Baggage_info (

	@SerializedName("carryOn") val carryOn : CarryOn,
	@SerializedName("firstBaggageCollection") val firstBaggageCollection : List<FirstBaggageCollection>
)