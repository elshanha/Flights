package com.example.entities.model
import com.google.gson.annotations.SerializedName

data class Average_price_breakdown (

	@SerializedName("base") val base : Int,
	@SerializedName("tax") val tax : Int,
	@SerializedName("service") val service : Double,
	@SerializedName("reissue_service") val reissue_service : Int,
	@SerializedName("total") val total : Double,
	@SerializedName("currency") val currency : String,
	@SerializedName("discount") val discount : Int,
	@SerializedName("displayed_currency") val displayed_currency : String,
	@SerializedName("internal_assurance") val internal_assurance : Int,
	@SerializedName("extra_fee") val extra_fee : Int,
	@SerializedName("penalty") val penalty : Int
)