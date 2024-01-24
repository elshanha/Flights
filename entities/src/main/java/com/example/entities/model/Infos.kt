package com.example.entities.model
import com.example.entities.model.Baggage_info
import com.example.entities.model.Duration
import com.google.gson.annotations.SerializedName

data class Infos (

    @SerializedName("is_reservable") val is_reservable : Boolean,
    @SerializedName("is_promo") val is_promo : Boolean,
    @SerializedName("duration") val duration : Duration,
    @SerializedName("baggage_info") val baggage_info : Baggage_info,
    @SerializedName("is_virtual_interlining") val is_virtual_interlining : Boolean,
    @SerializedName("is_business") val is_business : Boolean,
    @SerializedName("active_warning") val active_warning : String,
    @SerializedName("is_mask_required") val is_mask_required : Boolean
)