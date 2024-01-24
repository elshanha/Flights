package com.example.flights

import com.example.entities.model.ShowFlights
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.common.flowstate.Resource
import com.example.common.flowstate.State
import com.example.domain.mapper.FlightsMapper
import com.example.domain.usecases.FlightsUseCase
import com.example.entities.uimodel.FlightListUIModel
import com.example.entities.uimodel.FlightUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject

@HiltViewModel
class FlightsViewModel @Inject constructor(
    private val flightsUseCase : FlightsUseCase,
    private val flightsMapper: FlightsMapper
) : ViewModel() {

    val state : MutableStateFlow<State?> = MutableStateFlow(null)

    val data = MutableLiveData<FlightUIState?>()

    suspend fun getFlightsList() {
        flightsUseCase.getFlightList().collectLatest {
        when(it) {
            is Resource.Error -> state.emit(State.error(it.message))
            is Resource.Loading -> state.emit(State.loading())
            is Resource.Success -> {
                state.emit(State.success())
                it.data?.data?.let {
                    val mappedData = flightsMapper.map(it)
                    data.postValue(mappedData)
                }
            }
        }
        }
    }



}