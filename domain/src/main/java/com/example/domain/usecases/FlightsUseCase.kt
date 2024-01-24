package com.example.domain.usecases

import com.example.common.flowstate.Resource
import com.example.data.repo.FlightsRepoInterface
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FlightsUseCase @Inject constructor(private val repoInterface: FlightsRepoInterface) {
    suspend fun getFlightList() = flow {
        emit(Resource.Loading())
        repoInterface.getApi()?.let {
            emit(Resource.Success(it))
        } ?: emit(Resource.Error("Error"))
    } .catch { e ->
        emit(Resource.Error(e.localizedMessage))
    }

}