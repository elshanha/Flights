package com.example.domain.mapper


import javax.inject.Inject
import com.example.entities.model.Data
import com.example.entities.uimodel.FlightHeaderUiModel
import com.example.entities.uimodel.FlightListUIModel
import com.example.entities.uimodel.FlightUIState

class FlightsMapper @Inject constructor() : BaseMapper<Data, FlightUIState> {
    override fun map(input: Data): FlightUIState {
            return FlightUIState(
                header = input.getFlightsHeader(),
                flights = input.getFlights()
            )
    }

    private fun Data.getFlightsHeader() : FlightHeaderUiModel {
        return FlightHeaderUiModel(
            origin = search_parameters?.origin?.city_name ?: "",
            destination = search_parameters?.destination?.city_name ?: "")
    }

    private fun Data.getFlights() : List<FlightListUIModel> {
        return flights?.departure?.map {
            FlightListUIModel(
                airlineName = "",
                airlineIcon = "",
                price = 0.0)
        } ?: listOf()
    }
}