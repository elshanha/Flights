package com.example.entities.model
import com.google.gson.annotations.SerializedName

data class CarryOn (

	@SerializedName("allowance") val allowance : Int,
	@SerializedName("type") val type : String,
	@SerializedName("unit") val unit : String,
	@SerializedName("part") val part : Int,
	@SerializedName("is_small") val is_small : Boolean
)