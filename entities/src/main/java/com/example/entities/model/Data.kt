package com.example.entities.model

import com.google.gson.annotations.SerializedName

data class Data (

	@SerializedName("search_parameters") val search_parameters : Search_parameters,
	@SerializedName("created_at") val created_at : String,
	@SerializedName("airlines") val airlines : List<Airlines>,
	@SerializedName("airports") val airports : List<Airports>,
	@SerializedName("stop_counts") val stop_counts : List<Int>,
	@SerializedName("baggages") val baggages : List<Int>,
	@SerializedName("filter_boundaries") val filter_boundaries : Filter_boundaries,
	@SerializedName("has_vi_flight") val has_vi_flight : Boolean,
	@SerializedName("info_message") val info_message : String,
	@SerializedName("search_url") val search_url : String,
	@SerializedName("short_search_url") val short_search_url : String,
	@SerializedName("currencies") val currencies : Currencies,
	@SerializedName("bus_search_data_tab") val bus_search_data_tab : String,
	@SerializedName("flights") val flights : Flights,
	@SerializedName("price_history") val price_history : Price_history
)