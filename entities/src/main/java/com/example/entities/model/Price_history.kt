package com.example.entities.model

import com.example.entities.model.Departure
import com.google.gson.annotations.SerializedName

data class Price_history (

	@SerializedName("departure") val departure : Departure
)