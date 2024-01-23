package com.example.flights

import ShowFlights
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.repo.FlightsRepo
import com.example.data.repo.FlightsRepoInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FlightsViewModel @Inject constructor(val repoInterface: FlightsRepoInterface) : ViewModel() {

    val data = MutableLiveData<ShowFlights?>()
    fun getFlightsData() {
        viewModelScope.launch {
            repoInterface.getApi()?.let {
                data.postValue(it)
            }
        }
    }

}