package com.example.data.repo

import ShowFlights
import com.example.network.api.MyApi
import javax.inject.Inject

interface FlightsRepoInterface {
    suspend fun getApi() : ShowFlights?
}

 class FlightsRepo @Inject constructor(val myApi: MyApi) : FlightsRepoInterface {
     override suspend fun getApi() : ShowFlights? {
        return myApi.getApi()
     }

 }