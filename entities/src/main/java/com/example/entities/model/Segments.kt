package com.example.entities.model
import com.example.entities.model.Arrival_datetime
import com.example.entities.model.Departure_datetime
import com.example.entities.model.Duration
import com.example.entities.model.Segment_attributes
import com.google.gson.annotations.SerializedName

data class Segments (

    @SerializedName("departure_datetime") val departure_datetime : Departure_datetime,
    @SerializedName("display_departure_datetime") val display_departure_datetime : String,
    @SerializedName("arrival_datetime") val arrival_datetime : Arrival_datetime,
    @SerializedName("display_arrival_datetime") val display_arrival_datetime : String,
    @SerializedName("class") val class1 : String,
    @SerializedName("flight_number") val flight_number : String,
    @SerializedName("origin") val origin : String,
    @SerializedName("destination") val destination : String,
    @SerializedName("marketing_airline") val marketing_airline : String,
    @SerializedName("operating_airline") val operating_airline : String,
    @SerializedName("available_seats") val available_seats : Int,
    @SerializedName("origin_terminal") val origin_terminal : String,
    @SerializedName("destination_terminal") val destination_terminal : String,
    @SerializedName("segment_delay") val segment_delay : String,
    @SerializedName("duration") val duration : Duration,
    @SerializedName("is_train") val is_train : Boolean,
    @SerializedName("segment_attributes") val segment_attributes : Segment_attributes,
    @SerializedName("is_virtual_interlining") val is_virtual_interlining : Boolean
)