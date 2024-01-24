package com.example.entities.model
import com.google.gson.annotations.SerializedName

data class Filter_boundaries (

    @SerializedName("departurePrice") val departurePrice : DeparturePrice,
    @SerializedName("returnPrice") val returnPrice : ReturnPrice,
    @SerializedName("departureMaxDuration") val departureMaxDuration : Int,
    @SerializedName("returnMaxDuration") val returnMaxDuration : Int
)