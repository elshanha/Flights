package com.example.entities.model
import com.google.gson.annotations.SerializedName

data class Search_parameters (

    @SerializedName("request_id") val request_id : String,
    @SerializedName("provider") val provider : String,
    @SerializedName("origin") val origin : Origin,
    @SerializedName("destination") val destination : Destination,
    @SerializedName("origins") val origins : List<Origins>,
    @SerializedName("destinations") val destinations : List<Destinations>,
    @SerializedName("departure_dates") val departure_dates : List<String>,
    @SerializedName("departure_date") val departure_date : String,
    @SerializedName("display_departure_date") val display_departure_date : String,
    @SerializedName("display_departure_dates") val display_departure_dates : List<String>,
    @SerializedName("return_date") val return_date : String,
    @SerializedName("display_return_date") val display_return_date : String,
    @SerializedName("adult") val adult : Int,
    @SerializedName("senior") val senior : Int,
    @SerializedName("student") val student : Int,
    @SerializedName("child") val child : Int,
    @SerializedName("infant") val infant : Int,
    @SerializedName("passenger_count") val passenger_count : Int,
    @SerializedName("passenger_servisable_count") val passenger_servisable_count : Int,
    @SerializedName("version") val version : Int,
    @SerializedName("is_one_way") val is_one_way : Boolean,
    @SerializedName("is_domestic") val is_domestic : Boolean,
    @SerializedName("is_direct") val is_direct : Boolean,
    @SerializedName("is_refundable") val is_refundable : Boolean,
    @SerializedName("flight_class") val flight_class : String
)