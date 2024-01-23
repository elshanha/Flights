package com.example.network.api

import ShowFlights
import retrofit2.http.GET

interface MyApi {

    @GET("flights")
    suspend fun getApi() : ShowFlights

}