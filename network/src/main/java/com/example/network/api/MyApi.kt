package com.example.network.api

import com.example.entities.model.ShowFlights
import retrofit2.http.GET

interface MyApi {

    @GET("flights")
    suspend fun getApi() : ShowFlights

}