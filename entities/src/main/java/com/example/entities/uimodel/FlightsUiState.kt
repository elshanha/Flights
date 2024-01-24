package com.example.entities.uimodel

data class FlightUIState (
    val header: FlightHeaderUiModel,
    val flights: List<FlightListUIModel>)
data class FlightHeaderUiModel(
    val origin : String,
    val destination: String)
data class FlightListUIModel(
    var airlineIcon : String,
    var airlineName : String,
    val price : Double )
